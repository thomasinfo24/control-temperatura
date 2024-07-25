package ObververTem;

public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperatura actual: " + temperature + "°C");
    }
}

