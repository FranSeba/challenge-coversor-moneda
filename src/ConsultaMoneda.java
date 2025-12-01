import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda convertirMoneda(String monedaBase, String monedaFinal, double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/4f1730bc08c7a0f26e34c0d7/pair/" + monedaBase + "/" + monedaFinal + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }catch (Exception e){
            throw new RuntimeException("Hubo un error al consultar la API: " + e.getMessage());
        }
    }
}
