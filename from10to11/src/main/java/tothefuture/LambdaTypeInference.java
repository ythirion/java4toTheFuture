package tothefuture;

import java.util.List;
import java.util.function.Function;

import static java.lang.System.out;

public class LambdaTypeInference {

    public static void main(String[] args) {
        Function<String, String> append = (String string) -> string + " ";

        Function<String, String> append2 = (var s) -> s + " concat";

        out.println(append2.apply("string"));

        // compile error in Java 10
        // Function<String, String> append3 = (var string) -> string + " ";

        List<EnterpriseGradeType<With, Generics>> types = List.of();

        types.forEach((EnterpriseGradeType<With, Generics> type) -> out.println(type));

        types.forEach((var type) -> out.println(type));
    }

    class With {}
    class Generics {}
    class EnterpriseGradeType<T, G>{}
}
