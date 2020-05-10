package tothefuture;

import java.util.ArrayList;
import java.util.List;

public class LocalVariableTypeInference {

    // var numbers4;

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        var numbers2 = List.of(1, 3, 5); // the var variable needs to get a value right away
        System.out.println(numbers2.getClass().getCanonicalName());

        // var numbers3;
        // numbers3 = List.of(1, 3, 5);

        var numbers5 = new ArrayList<>();
        System.out.println(numbers5.getClass().getCanonicalName());
    }

}
