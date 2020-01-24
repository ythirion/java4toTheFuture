## Refactoring

Using [Java7 Try with Resources](https://www.baeldung.com/java-try-with-resources) the code can be refactored as follows.

```java
public static String printWriter() {
    StringWriter sw = new StringWriter();
    try(PrintWriter pw = new PrintWriter(sw);) {
        pw.write("Hello, world!");
        return sw.toString();
    }
}

public static List<String> readWords(File file) throws FileNotFoundException {
    try (Scanner scanner = new Scanner(file)) {
        List<String> words = new ArrayList<String>();
        while (scanner.hasNext()) {
            words.addAll(words(scanner.nextLine()));
        }
        return words;
    }
}
```