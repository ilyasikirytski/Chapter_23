package tasks.task_4;

import java.util.ArrayList;
import java.util.List;

public class Composite {
    private final List<Territory> countries = new ArrayList<>();

    public void addCountry(Territory country){
        countries.add(country);
    }

    public void showInfo() {
        for (Territory country : countries){
            country.showInfo();
        }
    }
}
