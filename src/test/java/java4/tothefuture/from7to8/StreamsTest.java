package java4.tothefuture.from7to8;

import org.junit.Test;

import static java4.tothefuture.from7to8.Streams.averageMaleSalary;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class StreamsTest {
    @Test
    public void averageMaleSalaryTest() {
        Person[] persons = {
                new Person(2300, "Michel", Sex.Male),
                new Person(2500, "Fabrice", Sex.Male),
                new Person(2700, "Fabrice", Sex.Male),
                new Person(4500, "Daniela", Sex.Female)
        };

        assertThat(averageMaleSalary(persons), equalTo(2500d));
    }

    @Test
    public void girlPowerSalaryTest() {
        Person[] persons = {
                new Person(6000, "Sofia", Sex.Female),
                new Person(9000, "Karen", Sex.Female),
                new Person(4500, "Daniela", Sex.Female)
        };

        assertThat(averageMaleSalary(persons), equalTo(0d));
    }

    @Test
    public void averageNullOrEmptyTest() {
        Person[] persons = { };
        assertThat(averageMaleSalary(persons), equalTo(0d));
        assertThat(averageMaleSalary(null), equalTo(0d));
    }
}
