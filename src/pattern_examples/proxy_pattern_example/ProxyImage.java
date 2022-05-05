package pattern_examples.proxy_pattern_example;

public class ProxyImage implements Image {
    String file;
    Image image;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(file);
        }
        image.display();
    }
}
