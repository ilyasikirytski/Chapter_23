package pattern_examples.flyweight_pattern_example;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);
        if (shape == null) {
            switch (shapeName) {
                case "circle":
                    shape = new CircleShape();
                    break;
                case "square":
                    shape = new SquareShape();
                    break;
                case "point":
                    shape = new PointShape();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}
