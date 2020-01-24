package java4.tothefuture.from7to8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java4.tothefuture.from7to8.Streams.averageMaleSalary;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class StreamsTest {
    @Test
    public void averageMaleSalaryTest() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(2300, "Michel", Sex.Male));
        persons.add(new Person(2500, "Fabrice", Sex.Male));
        persons.add(new Person(2700, "Bernard", Sex.Male));
        persons.add(new Person(4500, "Daniela", Sex.Female));

        assertThat(averageMaleSalary(persons), equalTo(2500d));
    }

    @Test
    public void girlPowerSalaryTest() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(6000, "Sofia", Sex.Female));
        persons.add(new Person(9000, "Karen", Sex.Female));
        persons.add(new Person(4500, "Daniela", Sex.Female));

        assertThat(averageMaleSalary(persons), equalTo(0d));
    }

    @Test
    public void averageNullOrEmptyTest() {
        assertThat(averageMaleSalary(new ArrayList<>()), equalTo(0d));
        assertThat(averageMaleSalary(null), equalTo(0d));
    }
}