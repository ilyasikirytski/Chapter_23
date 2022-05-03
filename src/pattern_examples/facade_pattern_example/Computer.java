package pattern_examples.facade_pattern_example;

//facade
public class Computer {
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    public void copy() {
        power.on();
        dvdRom.load();
        dvdRom.unload();
        hdd.copyFromDVD(dvdRom);
    }
}
