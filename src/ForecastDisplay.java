public class ForecastDisplay implements Display {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherStation weatherStation; // add this line

    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation; // and this line
    }

    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherStation.getPressure(); // change this line
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}


