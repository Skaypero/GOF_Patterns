public class SpamFilter extends MessageHandler {
    @Override
    public void handle(String message) {
        if (message.contains("spam") || handler == null) {
            System.out.println("Message is blocked");
        } else {
            handler.handle(message);
        }
    }
}
