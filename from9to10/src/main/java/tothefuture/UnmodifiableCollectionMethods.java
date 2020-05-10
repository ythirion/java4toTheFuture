package tothefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableCollectionMethods {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");


        // List -> copy Of
        List<String> unmodifiable = List.copyOf(list);
        unmodifiable.add("fail"); // this will fail


        // Collectors -> to Unmodifiable List
        unmodifiable = list.stream()
                .filter(i -> i.equals("1"))
                .collect(Collectors.toUnmodifiableList());

        unmodifiable.add("fail"); // this will fail
    }
}
