package com.example.sping_portfolio;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class movies {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://imdb8.p.rapidapi.com/auto-complete?q=game%20of%20thr"))
            .header("x-rapidapi-host", "imdb8.p.rapidapi.com")
            .header("x-rapidapi-key", "7a79b8a230mshff68040a0bd2bf0p1174f8jsnf85b178f3369")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

    public movies() throws IOException, InterruptedException {
    }
}
