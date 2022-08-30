package capgemini.lecture1;

import java.util.List;
import java.util.Stack;

public class StackStringReplacement implements StringReplacement {

    private List<BuilderStringReplacement.Rule> rules = List.of(new BuilderStringReplacement.ABRule(), new BuilderStringReplacement.CDRule());

    @Override
    public String replace(String text) {
        if (text == null || text.isBlank()) {
            return text;
        }

        Stack<Character> stack = new Stack<>();

        char prevCh = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            for (BuilderStringReplacement.Rule rule : rules) {
                if (rule.match(ch, prevCh)) {
                    ch = 0;
                    stack.pop();
                    prevCh = stack.isEmpty() ? 0 : stack.peek();
                    break;
                }
            }

            if (ch != 0) {
                stack.push(ch);
                prevCh = ch;
            }
        }

        if (stack.isEmpty()) {
            return "";
        } else {
            char[] arr = new char[stack.size()];
            for (int i = 0; i < stack.size(); i++) {
                arr[i] = stack.get(i);
            }
            return new String(arr);
        }

    }
}
