package tasks.task_B_5;

import java.util.ArrayList;
import java.util.List;

/*
Паттерн Flyweight. Разработать систему учета процессов размножения колонии бактерий.
 */
public class Main {
    public static void main(String[] args) {
        BacteryFactory bacteryFactory = new BacteryFactory();
        List<Bactery> bacteries = new ArrayList<>();
        bacteries.add(bacteryFactory.getBactery("bactery1"));
        bacteries.add(bacteryFactory.getBactery("bactery2"));
        bacteries.add(bacteryFactory.getBactery("bactery3"));
        bacteries.add(bacteryFactory.getBactery("bactery3"));
        bacteries.add(bacteryFactory.getBactery("bactery2"));
        bacteries.add(bacteryFactory.getBactery("bactery2"));
        bacteries.add(bacteryFactory.getBactery("bactery1"));

        for (Bactery bactery : bacteries) {
            bactery.reproduction(2);
        }
    }
}
