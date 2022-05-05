package tasks.task_3;

public class Student {
    private Study study;
    private String typeOfStudent;

    public Student(String typeOfStudent) {
        this.typeOfStudent = typeOfStudent;
    }

    public void setStrategy(Study study) {
        this.study = study;
    }

    void executeStrategy() {
        study.study(typeOfStudent);
    }
}
