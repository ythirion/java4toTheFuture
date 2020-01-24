package java4.tothefuture.from4to5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ForeachTests {

    @Test
    public void testCountNumberOfMale() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(Sex.Male));
        persons.add(new Person(Sex.Male));
        persons.add(new Person(Sex.Female));
        persons.add(new Person(Sex.Male));

        assertThat(ForEach.countNumberOfMaleOld(persons), equalTo(3));
        assertThat(ForEach.countNumberOfMaleOld(persons), equalTo(ForEach.countNumberOfMaleNew(persons)));
    }

}
