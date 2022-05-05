package pattern_examples.flyweight_pattern_example;

//concrete flyweight
public class CircleShape implements Shape {
    @Override
    public void draw(int x, int y) {
        int r = 5;
        System.out.println("(" + x + "," + y + "): draw circle with radius " + r);
    }
}
