package tasks.task_B_2;

public class Word implements Texted {
    private String words;

    public Word(String word) {
        this.words = word;
    }

    public void showText() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Слово: " + words + "\n";
    }
}
