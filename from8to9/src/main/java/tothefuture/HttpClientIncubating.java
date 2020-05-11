package tothefuture;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @see <a href="https://www.baeldung.com/java-9-http-client">https://www.baeldung.com/java-9-http-client</a>
 */
public class HttpClientIncubating {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("http://postman-echo.com/get"))
                .GET()
                .build();

        final HttpClient client = HttpClient.newBuilder().build();
        final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandler.asString());

        System.out.println(response.body());
    }
}
