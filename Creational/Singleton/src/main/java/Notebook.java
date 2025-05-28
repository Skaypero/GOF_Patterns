public class Notebook {
    public int getHash() {
        Logger logger = Logger.getInstance();
        logger.log("notebook");
        return logger.hashCode();
    }
}
