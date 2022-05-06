package tasks.task_B_2;

import java.util.ArrayList;
import java.util.List;

public class Pargraph implements Texted {
    private String paragraph;
    private List<Texted> sentences = new ArrayList<>();

    public Pargraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public Pargraph(String paragraph, Sentence sentence) {
        this.paragraph = paragraph;
        this.sentences.add(sentence);
    }

    public void showText() {
        System.out.println("Абзац: " + paragraph);
        for (Texted text : sentences) {
            text.showText();
        }
    }
}
