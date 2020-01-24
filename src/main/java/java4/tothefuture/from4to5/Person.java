package java4.tothefuture.from4to5;

import lombok.Data;

@Data
public class Person {
    private final Sex sex;

    public Person(Sex sex){
        this.sex = sex;
    }
}