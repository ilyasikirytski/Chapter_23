package tasks.task_3;

/*
Создать суперкласс Учащийся и подклассы Школьник и Студент.
Определить способы обучения и (возможности его продолжения????).
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Schoolboy("schoolboy");
        Student student1 = new UniversityStudent("university student");

        student.setStrategy(new SimpleStudy());
        student.executeStrategy();
        student1.setStrategy(new HardStudy());
        student1.executeStrategy();
    }
}
