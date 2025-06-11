public class Main {
    public static void main(String[] args) {
        String input = "3 + 5 - 8";
        Parser parser = new Parser();
        Converter converter = new Converter();
        int result = parser.parse(converter.convert(input)).interpret();
        System.out.println(result);
    }
}
