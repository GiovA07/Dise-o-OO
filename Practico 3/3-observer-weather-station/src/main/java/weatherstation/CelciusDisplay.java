package weatherstation;

public class CelciusDisplay implements Observer, DisplayElement {
	private double temperature;

	private WeatherData weatherData;

	public CelciusDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		temperature = transformFahrenheitCelcius(temp);
		display();
	}

	private double transformFahrenheitCelcius(float fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}

	public void display() {
		System.out.println("Temperature is: " + temperature);
	}

}
