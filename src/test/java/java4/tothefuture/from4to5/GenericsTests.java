package java4.tothefuture.from4to5;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GenericsTests {

    @Test
    public void testAddInt() {
        assertThat(Generics.addInt(4, 4), equalTo(8));
    }

    @Test
    public void testAddDouble() {
        assertThat(Generics.addDouble(4, 4), equalTo(8));
    }

    @Test
    public void testAddLong() {
        assertThat(Generics.addLong(4, 4), equalTo(8));
    }
}
