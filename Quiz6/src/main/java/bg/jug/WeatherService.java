/**Given the following classes write a WeatherPredictorTest class that tests the predict() method
 of the WeatherPredictor class assuming that WeatherService is mocked to return the same value as the degrees argument passed
 (instead of throwing an exception).

 Note: use fully qualified names, i.e.:

 @org.junit.jupiter.api.extension.ExtendWith
 @org.junit.jupiter.api.Test
 @org.mockito.Mock
 org.mockito.junit.jupiter.MockitoExtension
 org.mockito.Mockito
 org.junit.jupiter.api.Assertions
 */

package bg.jug;

public class WeatherService {
    public Integer predict(Integer weather) {
        throw new RuntimeException("Service is down.");
    }
}

class WeatherPredictor {
    private WeatherService weatherService = new WeatherService();


    public Integer predict(Integer degrees) {
        return weatherService.predict(degrees);
    }


    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
}
