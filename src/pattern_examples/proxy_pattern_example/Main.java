package pattern_examples.proxy_pattern_example;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("D://images/myImage.jpg");
        image.display();
    }
}
