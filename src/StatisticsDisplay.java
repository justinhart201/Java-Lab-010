public class StatisticsDisplay implements Display {
    private float temperatureMin;
    private float temperatureMax;
    private float tempRunningTotal;
    private int numReadings;

    public void update() {
        // update instance variables
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempRunningTotal / numReadings)
                + "/" + temperatureMax + "/" + temperatureMin);
    }
}

