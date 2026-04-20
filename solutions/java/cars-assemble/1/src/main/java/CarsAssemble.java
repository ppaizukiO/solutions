public class CarsAssemble {
    private final int carsAtLowestSpeed = 221;

    public double productionRatePerHour(int speed) {
        double successRate;
        if (speed >= 1 && speed <= 4) successRate = 1.0;
        else if (speed >= 5 && speed <= 8) successRate = 0.9;
        else if (speed == 9) successRate = 0.8;
        else if (speed == 10) successRate = 0.77;
        else successRate = 0.0;
        return (double) successRate * carsAtLowestSpeed * speed;
    }

    public int workingItemsPerMinute(int speed) {

        return (int) (productionRatePerHour(speed) / 60);
    }
}
