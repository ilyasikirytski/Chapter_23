package tasks.task_1;

abstract class Transport {
    private final String transportType;
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

    public Transport(String transportType, int maxSpeed, int costPerKilometerForPassenger, int costPerKilometerForCargo) {
        this.transportType = transportType;
        this.maxSpeed = maxSpeed;
        this.costPerKilometerForPassenger = costPerKilometerForPassenger;
        this.costPerKilometerForCargo = costPerKilometerForCargo;
    }

    public String getTimeOfShipping(double tripLength) {
        double hours = tripLength / getMaxSpeed();
        double minutes = (hours * 60) % 60;
        double seconds = (minutes * 60) % 60;
        return String.format("time of shipping: %02d:%02d:%02d%n", (int) hours, (int) minutes, (int) seconds);
    }

    public String getCostOfShipping(int tripLength) {
        int shippingCargoCost = tripLength * getCostPerKilometerForCargo();
        int shippingPassengerCost = tripLength * getCostPerKilometerForPassenger();
        return String.format("""
                %s shipping cargo cost: %s$
                %s shipping passenger cost: %s$
                %s %s""", transportType, shippingCargoCost, transportType, shippingPassengerCost, transportType, getTimeOfShipping(tripLength));
    }
}
