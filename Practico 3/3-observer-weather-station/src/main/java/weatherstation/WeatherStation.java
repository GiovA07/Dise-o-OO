package weatherstation;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		Observer currentDisplay = new CurrentConditionsDisplay(weatherData);
		Observer statisticsDisplay = new StatisticsDisplay(weatherData);
		Observer forecastDisplay = new ForecastDisplay(weatherData);

		System.out.println("First meansures");
		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("\n\nSecond meansures");
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println("\n\nThird meansures");
		weatherData.setMeasurements(78, 90, 29.2f);

		weatherData.removeObserver(forecastDisplay);
		weatherData.removeObserver(statisticsDisplay);
		System.out.println("\n\nRemove two observers");

		Observer celciusDisplay = new CelciusDisplay(weatherData);
		Observer thermalSensationDisplay  = new ThermalSensationDisplay(weatherData);

		weatherData.setMeasurements(62, 90, 28.1f);
	}
}
