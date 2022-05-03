package pattern_examples.bridge_pattern_example;

//refined abstraction
public class Sedan extends Car {
    public Sedan(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.println("sedan");
    }
}
