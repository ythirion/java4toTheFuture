package java4.tothefuture.from4to5;

import org.junit.Test;

public class AnnotationsTests {

    @Test
    public void createAUser() {
        User user = User.builder()
                .id(6)
                .email("perceval.degalles@gmail.com")
                .name("Perceval le gaulois")
                .build();
    }
}
