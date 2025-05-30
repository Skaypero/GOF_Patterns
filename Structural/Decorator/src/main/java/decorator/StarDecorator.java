package decorator;

import text.TextProcessor;

public class StarDecorator extends TextDecorator {
    public StarDecorator(TextProcessor processor) {
        super(processor);
    }

    @Override
    public String process() {
        return "***" + super.process() + "***";
    }
}
