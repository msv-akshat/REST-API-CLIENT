import java.io.*;
import java.net.*;
import org.json.*; // Add org.json dependency for parsing JSON

public class WeatherApp {

    // Fetches weather data from OpenWeather API
    public static void fetchWeatherData(String city) {
        String apiKey = "508dddef06904eff8bfdf6cbfd9d4435";
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parse JSON response
            JSONObject jsonResponse = new JSONObject(response.toString());
            JSONObject mainData = jsonResponse.getJSONObject("main");
            JSONArray weatherArray = jsonResponse.getJSONArray("weather");
            JSONObject weatherData = weatherArray.getJSONObject(0);

            System.out.println("City: " + jsonResponse.getString("name"));
            System.out.println("Temperature: " + mainData.getDouble("temp") + "°C");
            System.out.println("Weather: " + weatherData.getString("description"));

        } catch (Exception e) {
            System.out.println("Error fetching weather data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a city name.");
            return;
        }
        fetchWeatherData(args[0]);
    }
}
