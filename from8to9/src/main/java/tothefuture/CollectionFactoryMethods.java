package tothefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CollectionFactoryMethods {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        List<String> list9 = List.of("1", "2", "3");
        Map<String, Integer> map9 = Map.of(
                "1", 1,
                "2", 2,
                "3", 3
        );

    }
}
