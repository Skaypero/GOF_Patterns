package decorator;

import text.TextProcessor;

public class UppercaseDecorator extends TextDecorator {
    public UppercaseDecorator(TextProcessor processor) {
        super(processor);
    }

    @Override
    public String process() {
        return super.process().toUpperCase();
    }
}
