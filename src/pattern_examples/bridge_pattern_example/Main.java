package pattern_examples.bridge_pattern_example;

public class Main {
    public static void main(String[] args) {
        Car car = new Coupe(new Mresedes());
        car.showDetails();
    }
}
