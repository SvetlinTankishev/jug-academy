package bg.jug;

@org.junit.jupiter.api.extension.ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
class WeatherPredictorTest {
    @org.mockito.Mock
    private WeatherService weatherService;

    @org.junit.jupiter.api.Test
    void predict_ReturnsSameValueAsDegreesArgument() {
        Integer degrees = 25;
        WeatherPredictor weatherPredictor = new WeatherPredictor();
        weatherPredictor.setWeatherService(weatherService);

        org.mockito.Mockito.when(
                weatherService.predict(
                        org.mockito.Mockito.anyInt())).thenAnswer(
                invocation -> invocation.getArgument(0));

        Integer result = weatherPredictor.predict(degrees);

        org.junit.jupiter.api.Assertions.assertEquals(degrees, result);
    }
}
