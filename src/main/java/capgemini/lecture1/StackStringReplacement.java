package capgemini.lecture1;

import java.util.ArrayList;
import java.util.List;

public class StackStringReplacement implements StringReplacement {

    private List<BuilderStringReplacement.Rule> rules = List.of(new BuilderStringReplacement.ABRule(), new BuilderStringReplacement.CDRule());

    @Override
    public String replace(String text) {
        if (text == null || text.isBlank()) {
            return text;
        }

        List<Character> stack = new ArrayList<>();

        char prevCh = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            for (BuilderStringReplacement.Rule rule : rules) {
                if (rule.match(ch, prevCh)) {
                    ch = 0;
                    stack.remove(stack.size() - 1);
                    prevCh = stack.isEmpty() ? 0 : stack.get(stack.size() - 1);
                    break;
                }
            }

            if (ch != 0) {
                stack.add(ch);
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
