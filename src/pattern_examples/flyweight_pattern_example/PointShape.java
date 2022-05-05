package pattern_examples.flyweight_pattern_example;

//concrete flyweight
public class PointShape implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): draw point ");
    }
}
