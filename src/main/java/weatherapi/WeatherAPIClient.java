package weatherapi;

import java.net.URI;
    import java.net.http.HttpClient;
    import java.net.http.HttpResponse;
    import java.net.http.HttpRequest;
    import org.json.JSONObject;

    public class WeatherAPIClient {
    public static void main(String[] main){
        try {
            //1. API URL
            String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=22&longitude=79&current_weather=true";

            //2.create HTTPClient and HTTPRequest
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .build();

            //3. send the request and get the response as string
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //4. parse JSON using org.json
            JSONObject json = new JSONObject(response.body());
            JSONObject currentWeather = json.getJSONObject("current_weather");

            //Display the weather data
            System.out.println("weather in chennai");
            System.out.println(currentWeather.getDouble("temperature"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    }
