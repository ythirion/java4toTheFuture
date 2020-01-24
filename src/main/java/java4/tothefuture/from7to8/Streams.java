package java4.tothefuture.from7to8;

public class Streams {

    // TODO : Use Stream API Filter + ForEach
    public static int averageMaleSalary(Person[] persons) {
        if (persons == null || persons.length == 0) {
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
}