package tasks.task_B_1;

public class City implements Territory{

    private final String name;
    private final int countOfPeople;

    public City(String name, int countOfPeople) {
        this.name = name;
        this.countOfPeople = countOfPeople;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Город: " + name + ", Население: " + countOfPeople + "\n";
    }
}
