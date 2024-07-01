package weatherstation;

import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class DisplayTest {
	// @Test
	// public void temperatureInCentigrades1() {
	// 		// Creamos un mock para CurrentConditionsDisplay
	// 		CurrentConditionsDisplay display = mock(CurrentConditionsDisplay.class);

	// 		// Creamos una instancia de WeatherData
	// 		WeatherData weatherData = new WeatherData();

	// 		// Creamos una instancia de CurrentConditionsDisplay pasando el mock de display
	// 		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

	// 		// Registramos el observador (display)
	// 		weatherData.registerObserver(display);

	// 		// Llamamos al método setMeasurements en WeatherData con algunos valores de prueba
	// 		weatherData.setMeasurements(80, 25, 30);

	// 		// Verificamos que se haya llamado al método display en el mock de display
	// 		verify(display);
	// }
	// @Test
	// public void temperatureInCelcius() {
	// 	WeatherData weatherData = new WeatherData();
	// 	CelciusDisplay display = createMock(CelciusDisplay.class);
	// 	display.update(80, 25, 30);
	// 	replay(display);

	// 	weatherData.registerObserver(display);
	// 	weatherData.setMeasurements(80, 25, 30);

	// 	verify(display);
	// }
}
