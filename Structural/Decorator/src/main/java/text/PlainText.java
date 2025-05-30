package text;

public class PlainText implements TextProcessor {
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String process() {
        return text;
    }
}
