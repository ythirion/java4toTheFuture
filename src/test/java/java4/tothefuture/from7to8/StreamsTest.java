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
                new Person(10, "Fabrice"),
                new Person(10, "Robert")
        };

        assertThat(averAge(persons), equalTo(10));
    }
}
