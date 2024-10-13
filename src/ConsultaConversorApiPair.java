import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversorApiPair {
    //String base_code, String base_target
    public Moneda buscador(String base_code,
                           String target_code) {
        Moneda respuesta;
        URI dir = URI.create("https://v6.exchangerate-api.com/v6/f68f364b50fbddd9aa24c7d9/pair/"+base_code+"/"+target_code);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(dir)))
                .build();

        try {
            HttpResponse<String> response = client.
                    send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró la moneda");
        }
    }
}


