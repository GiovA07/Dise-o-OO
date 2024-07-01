package weatherstation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class ObserverTest {

  @Test
  public void testOfObserver() {
      CelciusDisplay celcius = mock(CelciusDisplay.class);
      CurrentConditionsDisplay currentCondicion = mock(CurrentConditionsDisplay.class);
      StatisticsDisplay statics = mock(StatisticsDisplay.class);
      WeatherData weatherData = new WeatherData();

      weatherData.registerObserver(celcius);
      weatherData.registerObserver(currentCondicion);
      weatherData.registerObserver(statics);

      weatherData.setMeasurements(80, 65, 30.4f);

      verify(celcius).update(weatherData);
      verify(currentCondicion).update(weatherData);
      verify(statics).update(weatherData);
  }


}
