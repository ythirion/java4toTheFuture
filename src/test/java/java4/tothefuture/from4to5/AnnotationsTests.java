package java4.tothefuture.from4to5;

import org.junit.Test;

public class AnnotationsTests {
    @Test
    public void createAUserPainfully() {
        UserOld user = new UserOld();
        user.setEmail("perceval.degalles@gmail.com");
        user.setId(6);
        user.setName("Perceval le gaulois");
    }

    /**
     * TODO: Do the same as {@link AnnotationsTests#createAUserPainfully}
     * BUT without implementing setters in UserNew and by using lombok.
     */
    @Test
    public void createAUserAndEnjoyIt() {
        UserNew user = new UserNew();

    }
}
