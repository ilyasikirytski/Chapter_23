package tasks.task_B_2;

import java.util.ArrayList;
import java.util.List;

public class Header implements Texted {
    private String header;
    private List<Texted> words = new ArrayList<>();

    public Header(String header) {
        this.header = header;
    }

    public Header(String header, Pargraph word) {
        this.header = header;
        this.words.add(word);
    }

    public void showText() {
        System.out.println("Заголовок: " + header);
        for (Texted text : words) {
            text.showText();
        }
    }
}
