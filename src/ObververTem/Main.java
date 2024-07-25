package ObververTem;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(weatherWarning);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(35);
    }
}

