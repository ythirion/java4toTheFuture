package java4.tothefuture.from4to5;

import java.util.Iterator;
import java.util.List;

public class ForEach {

    public static int countNumberOfMaleOld(List<Person> population){
        int numberOfMale = 0;
        Iterator<Person> iterator = population.iterator();

        while(iterator.hasNext()){
            Person current = iterator.next();

            if(current.getSex() == Sex.Male){
                numberOfMale++;
            }
        }
        return numberOfMale;
    }

    /**
     * TODO: Do the same as {@link ForEach#countNumberOfMaleOld(List)} but with foreach.
     */
    public static int countNumberOfMaleNew(List<Person> population){
        int numberOfMale = 0;

        for(Person p : population){
            numberOfMale += p.getSex() == Sex.Male ? 1 : 0;
        }
        return numberOfMale;
    }
}
