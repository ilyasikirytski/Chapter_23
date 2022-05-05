package tasks.task_2;

public class Train implements Tripable {

    @Override
    public void start(Trip trip) {
        System.out.println("Train " + trip);
    }
}
