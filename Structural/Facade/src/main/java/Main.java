public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.startMovie();
        System.out.println("****************");
        facade.stopMovie();
    }
}
