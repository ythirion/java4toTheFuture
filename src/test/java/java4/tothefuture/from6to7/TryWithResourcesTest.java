package java4.tothefuture.from6to7;

import org.junit.Test;

import static java4.tothefuture.from6to7.TryWithResources.tryWithResources;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TryWithResourcesTest {
    @Test
    public void testSimpleTryWithResources() {
        assertThat(tryWithResources(), equalTo("Hello, world!"));
    }
}
