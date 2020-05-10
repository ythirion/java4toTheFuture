package java4.tothefuture.from4to5;

import java.util.Iterator;
import java.util.List;

public class ForEach {

    /**
     * TODO: use the foreach keyword.
     */
    public static int countNumberOfMale(List<Person> population){
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
}
