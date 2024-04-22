package br.com.alura.oracle.one.guilhermepagio.api.network;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpRequester {

    private HttpRequester() {

    }

    public static HttpResponse<String> disparaRequisicaoget(URI uri) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        return request(client, uri);

    }

    private static HttpResponse<String> request(HttpClient client, URI uri) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        return client.send(request, HttpResponse.BodyHandlers.ofString());

    }
}
