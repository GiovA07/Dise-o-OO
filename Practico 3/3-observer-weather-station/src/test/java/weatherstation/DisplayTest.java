package weatherstation;

import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Test;

public class DisplayTest {
	@Test
	public void temperatureInCentigrades1() {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay display = createMock(CurrentConditionsDisplay.class);
		display.update(80, 25, 30);
		replay(display);

		weatherData.registerObserver(display);
		weatherData.setMeasurements(80, 25, 30);

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
