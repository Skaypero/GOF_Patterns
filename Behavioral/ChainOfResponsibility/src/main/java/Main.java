public class Main {
    public static void main(String[] args) {
        String message = "cat";
        MessageHandler spamFilter = new SpamFilter();
        MessageHandler lengthFilter = new LengthFilter();
        MessageHandler defaultHandler = new DefaultHandler();

        spamFilter.setHandler(lengthFilter);
        lengthFilter.setHandler(defaultHandler);
        spamFilter.handle(message);
    }
}
