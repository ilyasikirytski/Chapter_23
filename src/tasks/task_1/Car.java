package tasks.task_1;

public class Car extends Transport {
    public Car(int maxSpeed, int costPerKilometerForPassenger, int costPerKilometerForCargo) {
        super("Car", maxSpeed, costPerKilometerForPassenger, costPerKilometerForCargo);
    }

    public String getCostOfShipping(int tripLength) {
        return super.getCostOfShipping(tripLength);
    }
}
