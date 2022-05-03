package pattern_examples.bridge_pattern_example;

//refined abstraction
public class Hatchback extends Car {
    public Hatchback(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.println("hatchback");
    }
}
