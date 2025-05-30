package decorator;

import text.TextProcessor;

public abstract class TextDecorator implements TextProcessor {
    private TextProcessor processor;

    public TextDecorator(TextProcessor processor) {
        this.processor = processor;
    }

    @Override
    public String process() {
        return processor.process();
    }
}
