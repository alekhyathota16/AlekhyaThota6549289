import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo36 {
    public static void main(String[] args) throws Exception {

        // 1. Create HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // 2. Create HttpRequest (GitHub API example)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/octocat"))
                .GET()
                .build();

        // 3. Send request and get response
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        // 4. Print status code
        System.out.println("Status Code: " + response.statusCode());

        // 5. Print response body
        System.out.println("Response Body:");
        System.out.println(response.body());
    }
}