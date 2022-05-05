package tasks.task_1;

public class Carriage extends Transport {
    public Carriage(int maxSpeed, int costPerKilometerForPassenger, int costPerKilometerForCargo) {
        super("Carriage", maxSpeed, costPerKilometerForPassenger, costPerKilometerForCargo);
    }

    public String getCostOfShipping(int tripLength) {
        return super.getCostOfShipping(tripLength);
    }
}
