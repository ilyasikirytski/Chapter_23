package tasks.task_2;

public class Plane implements Tripable {

    @Override
    public void start(Trip trip) {
        System.out.println("Plane " + trip);
    }
}
