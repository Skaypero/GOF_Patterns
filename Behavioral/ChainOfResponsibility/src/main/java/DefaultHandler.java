public class DefaultHandler extends MessageHandler {
    @Override
    public void handle(String message) {
        System.out.println("Message is received");
    }
}
