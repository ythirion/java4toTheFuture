package java4.tothefuture.from7to8;

public class Person {
    private Integer salary;
    private String name;
    private Sex sex;

    public Person(Integer salary, String name, Sex sex) {
        this.salary = salary;
        this.name = name;
        this.sex = sex;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer age) {
        this.salary = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}