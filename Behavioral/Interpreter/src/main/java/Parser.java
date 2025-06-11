import java.util.ArrayDeque;
import java.util.Deque;

public class Parser {
    public Expression parse(String input) {
        String[] tokens = input.split(" ");
        Deque<Expression> deque = new ArrayDeque<>();

        for (String token: tokens) {
            if (token.equals("+")) {
                Expression right = deque.pop();
                Expression left = deque.pop();
                deque.push(new PlusExpression(left, right));
            } else if (token.equals("-")) {
                Expression right = deque.pop();
                Expression left = deque.pop();
                deque.push(new MinusExpression(left, right));
            } else {
                deque.push(new NumberExpression(Integer.parseInt(token)));
            }
        }

        return deque.pop();
    }
}
