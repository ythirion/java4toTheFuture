package java4.tothefuture.from4to5;

import java.util.List;

public class ForEach {

    public static int countNumberOfMale(List<Person> population){
        int numberOfMale = 0;

        for(Person p : population){
            numberOfMale += p.getSex() == Sex.Male ? 1 : 0;
        }
        return numberOfMale;
    }
}
