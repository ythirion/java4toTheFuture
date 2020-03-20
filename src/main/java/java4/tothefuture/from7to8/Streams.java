package java4.tothefuture.from7to8;

import java.util.List;

public class Streams {

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
}