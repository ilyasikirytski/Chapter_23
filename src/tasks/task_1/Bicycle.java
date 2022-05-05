package tasks.task_1;

public class Bicycle extends Transport {
    public Bicycle(int maxSpeed, int costPerKilometerForPassenger, int costPerKilometerForCargo) {
        super("Bicycle", maxSpeed, costPerKilometerForPassenger, costPerKilometerForCargo);
    }

    public String getCostOfShipping(int tripLength) {
        return super.getCostOfShipping(tripLength);
    }
}
