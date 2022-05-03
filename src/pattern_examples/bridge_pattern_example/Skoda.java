package pattern_examples.bridge_pattern_example;

//concrete implementor
public class Skoda implements Make{
    @Override
    public void setMake() {
        System.out.println("skoda");
    }
}
