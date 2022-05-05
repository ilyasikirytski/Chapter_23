package tasks.task_2;

public class PassengerCarrier{

    private Trip trip;

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public void startTrip() {
        if (trip.getCountOfAvailableRoutes() == 3) {
            Plane plane = new Plane();
            plane.start(trip);
        } else if (this.trip.getCountOfAvailableRoutes() == 4) {
            Car car = new Car();
            car.start(trip);
        } else if (this.trip.getCountOfAvailableRoutes() == 5) {
            Train train = new Train();
            train.start(trip);
        }
    }
}
