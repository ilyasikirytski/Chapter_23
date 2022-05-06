package tasks.task_B_2;

/*
Паттерн Composite. Разработать структуру хранения текста, который может
состоять из абзацев, предложений, листингов, заголовков, слов, знаков препинания и проч
 */
public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.addText(new Text("text1", new Header("header1", new Pargraph("paragraph1", new Sentence("sentence1", new Word("hello1"))))));
        composite.addText(new Pargraph("2", new Sentence("sentence2")));
        composite.addText(new Sentence("sentence3", new Word("hello2")));
        composite.addText(new Header("header2", new Pargraph("1", new Sentence("sentence1"))));
        composite.addText(new Header("header3", new Pargraph("1", new Sentence("sentence1"))));
        composite.addText(new Sentence("sentence2"));
        composite.addText(new Word("hello1"));
        composite.showText();
    }
}
