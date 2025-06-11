import java.util.ArrayDeque;
import java.util.Deque;

public class Converter {
    public String convert(String input) {
        String[] tokens = input.split(" ");
        Deque<String> deque = new ArrayDeque<>();
        String operand = null;

        for (String token: tokens) {
            if (token.equals("+") || token.equals("-")) {
                operand = token;
            } else {
                deque.add(token);

                if (operand != null) {
                    deque.add(operand);
                    operand = null;
                }
            }
        }

        return String.join(" ", deque);
    }
}
