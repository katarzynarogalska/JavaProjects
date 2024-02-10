package pl.edu.pw.mini.zpoif.pytelrogalska.weatherapp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import java.time.LocalDate;
import java.time.LocalTime;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WeatherRestControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetWeatherWithUnits() throws Exception {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalTime startTime = LocalTime.of(12, 0);
        LocalDate endDate = LocalDate.of(2024, 1, 2);
        LocalTime endTime = LocalTime.of(12, 0);

        ResultActions resultActions = mockMvc.perform(get("/api/weather/metric/Warsaw")
                        .param("startDate", startDate.toString())
                        .param("startTime", startTime.toString())
                        .param("endDate", endDate.toString())
                        .param("endTime", endTime.toString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        MvcResult result = resultActions.andReturn();
        String content = result.getResponse().getContentAsString();

        // Add your assertions based on the expected response
        // Example:
        // Assertions.assertEquals("Expected response", content);
    }
}
