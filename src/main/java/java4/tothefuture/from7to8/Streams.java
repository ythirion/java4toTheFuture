package java4.tothefuture.from7to8;

import java.util.Arrays;

public class Streams {

    // TODO : Use Stream API Filter + Map + sum
    public static double averageMaleSalary(Person[] persons) {
        if (persons == null) {
            return 0;
        }

        int sum = 0;
        int numOfMen = 0;

        for(Person person : persons) {
            if (person.getSex() == Sex.Male) {
                sum += person.getSalary();
                numOfMen++;
            }
        }

        return numOfMen == 0 ? 0 : sum/numOfMen;
    }

    public static double averageMaleSalaryNice(Person[] persons) {
        if (persons == null) {
            return 0;
        }

        return Arrays.stream(persons)
                .filter(person -> person.getSex() == Sex.Male)
                .mapToInt(Person::getSalary)
                .average().orElse(0);
    }
}