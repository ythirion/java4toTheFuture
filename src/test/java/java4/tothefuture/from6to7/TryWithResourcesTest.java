package java4.tothefuture.from6to7;

import org.junit.Test;

import static java4.tothefuture.from6to7.TryWithResources.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TryWithResourcesTest {
    @Test
    public void testSimpleTryWithResources() {
        assertThat(tryWithResourcesOld(), equalTo("Hello, world!"));
        assertThat(tryWithResourcesNew(), equalTo(tryWithResourcesOld()));
    }
}
