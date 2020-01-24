package java4.tothefuture.from6to7;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static java4.tothefuture.from6to7.TryWithResources.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TryWithResourcesTest {
    @Test
    public void testSimpleTryWithResources() {
        assertThat(printWriterOld(), equalTo("Hello, world!"));
        assertThat(printWriterNew(), equalTo(printWriterOld()));
    }

    @Test
    public void testTryWithResourcesAndFinally() throws Exception {
        File input = new File(getClass().getClassLoader().getResource("input.txt").getFile());
        List<String> expected = Arrays.asList("Hello", "world", "Java", "is", "very", "cool", "but", "Clojure", "is", "awesome");
        assertThat(readWordsOld(input), equalTo(expected));
        assertThat(readWordsOld(input), equalTo(readWordsNew(input)));
    }
}
