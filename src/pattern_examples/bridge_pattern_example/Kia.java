package pattern_examples.bridge_pattern_example;

//concrete implementor
public class Kia implements Make {

    @Override
    public void setMake() {
        System.out.println("kia");
    }
}
