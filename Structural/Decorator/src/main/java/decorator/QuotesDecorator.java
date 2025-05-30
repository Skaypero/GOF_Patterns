package decorator;

import text.TextProcessor;

public class QuotesDecorator extends TextDecorator {
    public QuotesDecorator(TextProcessor processor) {
        super(processor);
    }

    @Override
    public String process() {
        return "\"" + super.process() + "\"";
    }
}
