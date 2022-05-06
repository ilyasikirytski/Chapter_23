package tasks.task_B_5;

import java.util.HashMap;
import java.util.Map;

public class BacteryFactory {
    private static final Map<String, Bactery> bacteries = new HashMap<>();

    public Bactery getBactery(String bacteryName) {
        Bactery bactery = bacteries.get(bacteryName);
        if (bactery == null) {
            switch (bacteryName) {
                case "bactery1":
                    bactery = new Bactery1();
                    break;
                case "bactery2":
                    bactery = new Bactery2();
                    break;
                case "bactery3":
                    bactery = new Bactery3();
                    break;
            }
            bacteries.put(bacteryName, bactery);
        }
        return bactery;
    }
}
