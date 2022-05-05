package tasks.task_2;

public class Car implements Tripable {

    @Override
    public void start(Trip trip) {
        System.out.println("Car " + trip);
    }
}
