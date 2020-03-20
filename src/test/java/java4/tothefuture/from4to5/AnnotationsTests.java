package java4.tothefuture.from4to5;

import org.junit.Test;

public class AnnotationsTests {

    /**
     * TODO: Refactor by using lombok.
     */
    @Test
    public void createAUser() {
        User user = new User();
        user.setEmail("perceval.degalles@gmail.com");
        user.setId(6);
        user.setName("Perceval le gaulois");
    }
}
