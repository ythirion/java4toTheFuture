package java4.tothefuture.from7to8;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Streams {

    // TODO : Use Stream API Filter + Map
    public static double averageMaleSalary(List<Person> persons) {
        if (persons == null) {
            return 0;
        }

        double sum = 0;
        int numOfMen = 0;

        for(Person person : persons) {
            if (person.getSex() == Sex.Male) {
                sum += person.getSalary();
                numOfMen++;
            }
        }

        return numOfMen == 0 ? 0 : sum/numOfMen;
    }

    public static double averageMaleSalary2(List<Person> persons) {
         return Optional.ofNullable(persons)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(person -> person.getSex() == Sex.Male)
                .mapToInt(Person::getSalary)
                .average().orElse(0);
    }
}