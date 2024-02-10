package pl.edu.pw.mini.zpoif.pytelrogalska.weatherapp.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import pl.edu.pw.mini.zpoif.pytelrogalska.weatherapp.model.MainObject;
import pl.edu.pw.mini.zpoif.pytelrogalska.weatherapp.pollution.MainPollutionObject;

import java.io.IOException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DataMapperTest {

    /*@Mock
    private WeatherApiClient weatherApiClient;

    @Mock
    private PollutionApiClient pollutionApiClient;

    @Mock
    private JsonReader jsonReader;

    @InjectMocks
    private DataMapper dataMapper;

    @Test
    void testGenerateObjectFromJson() throws IOException {
        // Arrange
        String cityName = "Warsaw";
        String units = "metric";
        URL weatherApiUrl = new URL("https://api.openweathermap.org/data/2.5/forecast?q=Warsaw&appid=your-api-key&units=metric");
        MainObject expectedObject = new MainObject(*//* initialize your MainObject with expected values *//*);

        // Mocking behavior
        when(weatherApiClient.getWeatherJsonFormApi(cityName, units)).thenReturn(weatherApiUrl);
        when(jsonReader.readJsonString(weatherApiUrl)).thenReturn("your-expected-json-response");
        when(dataMapper.generateObjectFromJson(cityName, units)).thenReturn(expectedObject);

        // Act
        MainObject result = dataMapper.generateObjectFromJson(cityName, units);

        // Assert
        assertEquals(expectedObject, result);
    }

    @Test
    void testGeneratePollutionFromJSON() throws IOException {
        // Arrange
        String lat = "latitude";
        String lng = "longitude";
        URL pollutionApiUrl = new URL("http://api.openweathermap.org/data/2.5/air_pollution/forecast?lat=latitude&lon=longitude&appid=your-api-key");
        MainPollutionObject expectedPollutionObject = new MainPollutionObject(*//* initialize your MainPollutionObject with expected values *//*);

        // Mocking behavior
        when(pollutionApiClient.getPollutionJsonFormApi(lat, lng)).thenReturn(pollutionApiUrl);
        when(jsonReader.readJsonString(pollutionApiUrl)).thenReturn("your-expected-json-response");
        when(dataMapper.generatePollutionFromJSON(lat, lng)).thenReturn(expectedPollutionObject);

        // Act
        MainPollutionObject result = dataMapper.generatePollutionFromJSON(lat, lng);

        // Assert
        assertEquals(expectedPollutionObject, result);
    }*/
}