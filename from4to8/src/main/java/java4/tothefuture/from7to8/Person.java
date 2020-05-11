package java4.tothefuture.from7to8;

import lombok.Data;

@Data
public class Person {
    private Integer salary;
    private String name;
    private Sex sex;

    public Person(Integer salary, String name, Sex sex) {
        this.salary = salary;
        this.name = name;
        this.sex = sex;
    }
}