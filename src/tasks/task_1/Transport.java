package tasks.task_1;

abstract class Transport {
    private final int maxSpeed;
    private final int costPerKilometerForPassenger;
    private final int costPerKilometerForCargo;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCostPerKilometerForPassenger() {
        return costPerKilometerForPassenger;
    }

    public int getCostPerKilometerForCargo() {
        return costPerKilometerForCargo;
    }

    public Transport(int maxSpeed, int costPerKilometerForPassenger, int costPerKilometerForCargo) {
        this.maxSpeed = maxSpeed;
        this.costPerKilometerForPassenger = costPerKilometerForPassenger;
        this.costPerKilometerForCargo = costPerKilometerForCargo;
    }

    public abstract String getTimeOfShipping(double tripLength);

    public abstract String getCostOfShipping(int tripLength);
}
