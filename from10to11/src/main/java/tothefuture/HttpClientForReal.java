package tothefuture;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @see <a href="https://www.baeldung.com/java-9-http-client">https://www.baeldung.com/java-9-http-client</a>
 */
public class HttpClientForReal {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("http://postman-echo.com/get"))
                .GET()
                .build();

        final HttpClient client = HttpClient.newBuilder().build();
        final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
