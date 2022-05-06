package tasks.task_B_2;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements Texted {
    private String sentence;
    private List<Texted> headers = new ArrayList<>();

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public Sentence(String sentence, Word header) {
        this.sentence = sentence;
        this.headers.add(header);
    }

    public void showText() {
        System.out.println("Предложение: " + sentence);
        for (Texted text : headers) {
            text.showText();
        }
    }
}
