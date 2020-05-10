package tothefuture;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

import static java.lang.System.out;

public class CollectionsToArray {

    public static void main(String[] args) {
        var users = List.of("toto", "bula", "jdoe");

        final Object[] objects = users.toArray();

        // to array with type
        final String[] strings = users.toArray(String[]::new);

        var clients = new ArrayList<HttpClient>();
        final HttpClient[] httpClientsArray = clients.toArray(HttpClient[]::new);
    }

}
