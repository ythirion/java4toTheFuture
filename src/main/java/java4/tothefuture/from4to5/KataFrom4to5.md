## Refactor using Generics

Using [Java5 Generics](https://www.baeldung.com/java-generics) the code can be refactored as follows.

```java
public static <T extends Number> double add(T a, T b){
	return a.doubleValue() + b.doubleValue();
}
```
## Refactor using enhanced for loop

Using [Java5 enhanced for loop](https://www.baeldung.com/java-for-loop) the code can be refactored as follows.

```java
public static int countNumberOfMaleNew(List<Person> population){
	int numberOfMale = 0;

	for(Person p : population){
		numberOfMale += p.getSex() == Sex.Male ? 1 : 0;
	}
	return numberOfMale;
}
```

## Refactor using lombok builder annotation

Using [Lombok](https://projectlombok.org/features/Builder) the code can be refactored as follows.

```java
import lombok.Builder;

@Builder
public class UserNew {
    private Integer id;
    private String email;
    private String name;
}

@Test
public void createAUserAndEnjoyIt() {
	UserNew user = UserNew.builder()
			.id(6)
			.email("perceval.degalles@gmail.com")
			.name("Perceval le gaulois")
			.build();
}
```
