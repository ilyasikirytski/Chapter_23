package pattern_examples.adapter_pattern_example;

public class Main {
    public static void main(String[] args) {
// 1-ый способ через наследование
        VectroGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();
// 2-ой способ через композицию
        VectorAdapterFromRaster2 g2 = new VectorAdapterFromRaster2(new RasterGraphics());
        g2.drawLine();
        g2.drawSquare();
    }
}
