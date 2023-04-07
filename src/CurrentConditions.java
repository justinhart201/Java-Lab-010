public class CurrentConditions implements Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherStation weatherStation;

    public void update() {
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        this.pressure = weatherStation.getPressure();
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity and pressure "
                + pressure);
    }
}

