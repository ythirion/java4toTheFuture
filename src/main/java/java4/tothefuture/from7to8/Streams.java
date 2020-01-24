package java4.tothefuture.from7to8;

public class Streams {

    public static int averAge(Person[] persons) {
        if (persons == null || persons.length == 0) {
            return 0;
        }

        int sum = 0;

        for(Person person : persons) {
            sum += person.getAge();
        }

        return sum/persons.length;
    }
}