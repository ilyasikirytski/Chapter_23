package pattern_examples.facade_pattern_example;

public class DVDRom {
    private boolean hasData;

    public boolean hasData() {
        return hasData;
    }

    public void load(){
        hasData = true;
    }

    public void unload(){
        hasData = false;
    }
}
