import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Converter {

    float convirtiendoMonedaCOP(float cantidad, String otraMoneda) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/3b9137d22d5693b2b6342817/latest/" + otraMoneda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        Gson gson = new Gson();
        Moneda a = gson.fromJson(response.body(), Moneda.class);
        Conversion_rates b = a.getConversion_rates();

        float c = b.getCOP();
        return c*cantidad;
    }

    float convirtiendoMonedaARS(String otraMoneda) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/3b9137d22d5693b2b6342817/latest/" + otraMoneda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        Gson gson = new Gson();
        Moneda a = gson.fromJson(response.body(), Moneda.class);
        Conversion_rates b = a.getConversion_rates();

        float c = b.getARS();
        return c;
    }

    float convirtiendoMonedaUSD(String otraMoneda) throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/3b9137d22d5693b2b6342817/latest/" + otraMoneda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        Gson gson = new Gson();
        Moneda a = gson.fromJson(response.body(), Moneda.class);
        Conversion_rates b = a.getConversion_rates();

        float c = b.getUSD();
        return c;
    }
}
