package tasks.task_2;

public class Trip {

    private final String trip;
    private int distance;
    private int countOfAvailableRoutes;

    public Trip(Trips trip) {
        this.trip = trip.name();
        switch (trip) {
            case MINSK_BREST -> {
                distance = 300;
                this.countOfAvailableRoutes = 3;
            }
            case MINSK_GOMEL -> {
                distance = 250;
                this.countOfAvailableRoutes = 4;
            }
            case MINSK_VITEBSK -> {
                distance = 350;
                this.countOfAvailableRoutes = 5;
            }
        }
    }

    public int getCountOfAvailableRoutes() {
        return countOfAvailableRoutes;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "trip='" + trip + '\'' +
                ", distance=" + distance +
                ", countOfAvailableRoutes=" + countOfAvailableRoutes +
                '}';
    }
}