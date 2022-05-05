package pattern_examples.proxy_pattern_example;

public class RealImage implements Image {
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    public void load() {
        System.out.println("loading " + file);
    }

    @Override
    public void display() {
        System.out.println("displaying " + file);
    }
}
