package pattern_examples.decorator_pattern_example;

abstract class Decorator implements PrinterInterface {
    private final PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print(){
        component.print();
    }
}
