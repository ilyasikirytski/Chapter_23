package tasks.task_B_1;

import java.util.ArrayList;
import java.util.List;

public class County implements Territory{

    private final String name;
    private final List<Territory> cities = new ArrayList<>();

    public County(String name, City city) {
        this.name = name;
        this.cities.add(city);
    }

    @Override
    public void showInfo() {
        System.out.println("Область: " + name);
        for (Territory territory : cities){
            territory.showInfo();
        }
    }
}
