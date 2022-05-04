package pattern_examples.adapter_pattern_example;

public class VectorAdapterFromRaster extends RasterGraphics implements VectroGraphicsInterface {
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
