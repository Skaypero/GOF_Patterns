import decorator.QuotesDecorator;
import decorator.StarDecorator;
import decorator.TextDecorator;
import decorator.UppercaseDecorator;
import text.PlainText;
import text.TextProcessor;

public class Main {
    public static void main(String[] args) {
        TextProcessor textProcessor = new PlainText("HELLO");
        TextDecorator decorator = new StarDecorator(new QuotesDecorator(new UppercaseDecorator(textProcessor)));
        System.out.println(decorator.process());
    }
}
