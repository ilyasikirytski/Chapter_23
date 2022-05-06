package tasks.task_B_2;

import java.util.ArrayList;
import java.util.List;

public class Composite {
    private final List<Texted> texts = new ArrayList<>();

    public void addText(Texted text) {
        texts.add(text);
    }

    public void showText() {
        for (Texted text : texts) {
            text.showText();
        }
    }
}
