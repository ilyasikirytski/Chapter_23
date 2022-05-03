package pattern_examples.bridge_pattern_example;

//refined abstraction
public class Coupe extends Car {
    public Coupe(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.println("coupe");
    }
}
