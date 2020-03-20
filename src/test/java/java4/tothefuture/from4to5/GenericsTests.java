package java4.tothefuture.from4to5;

import org.junit.Test;
import static java4.tothefuture.from4to5.Generics.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GenericsTests {

    @Test
    public void testAddInt() {
        assertThat(addInt(4, 4), equalTo(8.0));
    }

    @Test
    public void testAddDouble() {
        assertThat(addDouble(4, 4), equalTo(8.0));
    }

    @Test
    public void testAddLong() {
        assertThat(addLong(4, 4), equalTo(8.0));
    }
}