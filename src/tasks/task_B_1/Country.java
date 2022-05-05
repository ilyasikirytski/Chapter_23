package tasks.task_B_1;

import java.util.ArrayList;
import java.util.List;

public class Country implements Territory{
    private final String name;
    private final List<County> counties = new ArrayList<>();

    public Country(String name , County county) {
        this.name = name;
        this.counties.add(county);
    }

    @Override
    public void showInfo() {
        System.out.println("Страна: " + name);
        for (Territory territory : counties){
            territory.showInfo();
        }
    }
}
