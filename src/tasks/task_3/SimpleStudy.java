package tasks.task_3;

public class SimpleStudy implements Study {
    @Override
    public void study(String typeOfStudent) {
        System.out.println(typeOfStudent + ": простое обучение");
    }
}
