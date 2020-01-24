package java4.tothefuture.from7to8;

import java.util.List;

public class Streams {
    public static double averageMaleSalaryOld(List<Person> persons) {
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

    /**
     * TODO: Refactor this code by using Stream API filter + map.
     */
    public static double averageMaleSalaryNew(List<Person> persons) {
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