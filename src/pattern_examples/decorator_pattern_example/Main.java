package pattern_examples.decorator_pattern_example;

public class Main {
    public static void main(String[] args) {
//        PrinterInterface printerInterface = new Printer("hello!");
        PrinterInterface printerInterface = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Привет"))));
        printerInterface.print();
    }
}
