package br.com.alura.screenmatch.principal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class PrincipalComBuscas {

    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?t=divertidamente&apikey=b49e11ef"))
                .build();

    }

}
