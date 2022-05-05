package tasks.task_1;

public class Bicycle extends Transport {
    public Bicycle(int maxSpeed, int costPerKilometerForPassenger, int costPerKilometerForCargo) {
        super(maxSpeed, costPerKilometerForPassenger, costPerKilometerForCargo);
    }

    @Override
    public String getTimeOfShipping(double tripLength) {
        double hours = tripLength / super.getMaxSpeed();
        double minutes = (hours * 60) % 60;
        double seconds = (minutes * 60) % 60;
        return String.format("time of shipping: %02d:%02d:%02d%n", (int) hours, (int) minutes, (int) seconds);
    }

    @Override
    public String getCostOfShipping(int tripLength) {
        int shippingCargoCost = tripLength * super.getCostPerKilometerForCargo();
        int shippingPassengerCost = tripLength * super.getCostPerKilometerForPassenger();
        return String.format("bicycle shipping cargo cost: %s$\nbicycle shipping passenger cost: %s$\nbicycle time of shipping: %s", shippingCargoCost, shippingPassengerCost, getTimeOfShipping(tripLength));
    }
}
