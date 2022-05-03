package pattern_examples.facade_pattern_example;

public class HDD {
    public void copyFromDVD(DVDRom dvdRom){
        if (dvdRom.hasData()){
            System.out.println("данные копируются");
        } else {
            System.out.println("вставьте диск с данными");
        }
    }
}
