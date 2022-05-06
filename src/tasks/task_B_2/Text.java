package tasks.task_B_2;

import java.util.ArrayList;
import java.util.List;

public class Text implements Texted {
    private String text;
    private List<Texted> pargraphs = new ArrayList<>();

    public Text(String text) {
        this.text = text;
    }

    public Text(String text, Header pargraphs) {
        this.text = text;
        this.pargraphs.add(pargraphs);
    }

    public void showText() {
        System.out.println("Текст: " + text);
        for (Texted text : pargraphs) {
            text.showText();
        }
    }
}
