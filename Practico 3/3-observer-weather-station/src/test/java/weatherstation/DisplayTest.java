package weatherstation;

import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Test;

public class DisplayTest {
	@Test
	public void temperatureInCentigrades1() {
		WeatherData weatherData = new WeatherData();
		Observer display = createMock(CurrentConditionsDisplay.class);

		//El metodo update debe ser llamado con estos parametros.
		display.update(80, 25, 30);

		//El mock esta listo para ser utilizado y las invocaciones de metodos estan registradas y verificadas
		replay(display);

		weatherData.registerObserver(display);
		weatherData.setMeasurements(80, 25, 30);
		//se verifica que el metodo update del mock display haya sido llamado con los parametros (80, 25, 30)
		verify(display);
	}

	@Test
	public void temperatureInCelcius() {
		WeatherData weatherData = new WeatherData();
		CelciusDisplay display = createMock(CelciusDisplay.class);
		display.update(80, 25, 30);
		replay(display);

		weatherData.registerObserver(display);
		weatherData.setMeasurements(80, 25, 30);

		verify(display);
	}
}
