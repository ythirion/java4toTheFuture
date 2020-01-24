## Test cases 

When you add test cases, think about the nominal case as well as the limits of your system.

```java
@Test
public void averageMaleSalaryTest() {
    var persons = new ArrayList<Person>();
    persons.add(new Person(2300, "Michel", Sex.Male));
    persons.add(new Person(2500, "Fabrice", Sex.Male));
    persons.add(new Person(2700, "Bernard", Sex.Male));
    persons.add(new Person(4500, "Daniela", Sex.Female));

    assertThat(averageMaleSalary(persons), equalTo(2500d));
}

@Test
public void girlPowerSalaryTest() {
    var persons = new ArrayList<Person>();
    persons.add(new Person(6000, "Sofia", Sex.Female));
    persons.add(new Person(9000, "Karen", Sex.Female));
    persons.add(new Person(4500, "Daniela", Sex.Female));

    assertThat(averageMaleSalary(persons), equalTo(0d));
}

@Test
public void averageNullOrEmptyTest() {
    assertThat(averageMaleSalary(new ArrayList<>()), equalTo(0d));
    assertThat(averageMaleSalary(null), equalTo(0d));
}
```
## Refactoring

Use the [Java8 Stream API](https://www.baeldung.com/java-8-streams) to refactor the code.

The part where Optional.ofNullable is used replace the null check.

```java
public static double averageMaleSalary(List<Person> persons) {
    return Optional.ofNullable(persons)
            .orElseGet(Collections::emptyList)
            .stream()
            .filter(person -> person.getSex() == Sex.Male)
            .mapToInt(Person::getSalary)
            .average().orElse(0);
}
```