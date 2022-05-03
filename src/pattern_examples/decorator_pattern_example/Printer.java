package pattern_examples.decorator_pattern_example;

public class Printer implements PrinterInterface {
    private final String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.print(name);
    }
}
