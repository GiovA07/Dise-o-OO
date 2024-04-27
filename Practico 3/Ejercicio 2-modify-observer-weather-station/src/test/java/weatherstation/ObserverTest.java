package weatherstation;

import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Test;

public class ObserverTest {
  // @Test
  // void TestOfObserver(){
  //   // Crear instancias de los displays
	// 	CelciusDisplay celcius = createMock(CelciusDisplay.class);
  //   CurrentConditionsDisplay currentCondicion = createMock(CurrentConditionsDisplay.class);
  //   StatisticsDisplay statics = createMock(StatisticsDisplay.class);

  //   WeatherData weatherData = new WeatherData();

  //    // Registrar los displays con el objeto WeatherData
  //    weatherData.registerObserver(celcius);
  //    weatherData.registerObserver(currentCondicion);
  //    weatherData.registerObserver(statics);

  //    celcius.update(30, 65, 1015);
  //    replay(celcius);


  //    weatherData.removeObserver(currentCondicion);
  //    ForecastDisplay forecast = createMock(ForecastDisplay.class);
  //    weatherData.registerObserver(forecast);

  //    forecast.update(30, 65, 1015);
  //    replay(forecast);

  //    weatherData.setMeasurements(30, 65, 1015); // Nuevos datos del clima

  //    verify(celcius);
  //    verify(forecast);


  // }
}
