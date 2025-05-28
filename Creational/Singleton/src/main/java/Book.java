public class Book {
    public int getHash() {
        Logger logger = Logger.getInstance();
        logger.log("book");
        return logger.hashCode();
    }
}
