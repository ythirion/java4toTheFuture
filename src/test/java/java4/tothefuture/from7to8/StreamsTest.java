package java4.tothefuture.from7to8;

import org.junit.Test;

import static java4.tothefuture.from7to8.Streams.averAge;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class StreamsTest {
    @Test
    public void averAgeTest() {
        Person[] persons = {
                new Person(10, "Michel"),
                new Person(11, "Fabrice"),
                new Person(12, "Robert")
        };

        assertThat(averAge(persons), equalTo(11));
    }

    @Test
    public void averAgeNullOrEmptyTest() {
        Person[] persons = { };
        assertThat(averAge(persons), equalTo(0));
        assertThat(averAge(null), equalTo(0));
    }
}
