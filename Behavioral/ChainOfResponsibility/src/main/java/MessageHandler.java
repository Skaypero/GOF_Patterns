public abstract class MessageHandler {
    protected MessageHandler handler;
    public void setHandler(MessageHandler handler) {
        this.handler = handler;
    }

    public abstract void handle(String message);
}
