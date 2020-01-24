package java4.tothefuture.from4to5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ForeachTests {

    @Test
    public void testcountNumberOfMale() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(Sex.Male));
        persons.add(new Person(Sex.Male));
        persons.add(new Person(Sex.Female));
        persons.add(new Person(Sex.Male));

        assertThat(ForEach.countNumberOfMale(persons), equalTo(3));
    }

}
