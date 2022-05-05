package tasks.task_1;

public class Carriage extends Transport {
    public Carriage(int maxSpeed, int costPerKilometerForPassenger, int costPerKilometerForCargo) {
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
        return String.format("carriage shipping cargo cost: %s$\ncarriage shipping passenger cost: %s$\ncarriage time of shipping: %s", shippingCargoCost, shippingPassengerCost, getTimeOfShipping(tripLength));
    }
}
