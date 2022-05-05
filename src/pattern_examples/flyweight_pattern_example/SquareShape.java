package pattern_examples.flyweight_pattern_example;

//concrete flyweight
public class SquareShape implements Shape {
    @Override
    public void draw(int x, int y) {
        int a = 10;
        System.out.println("(" + x + "," + y + "): draw square with side: " + a);
    }
}
