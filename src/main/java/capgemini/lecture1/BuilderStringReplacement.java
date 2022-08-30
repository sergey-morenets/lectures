package capgemini.lecture1;

import java.util.List;

public class BuilderStringReplacement implements StringReplacement {

    private static final int TOKEN_LENGTH = 2;

    private List<Rule> rules = List.of(new ABRule(), new CDRule());

    @Override
    public String replace(String text) {
        if (text == null || text.isBlank()) {
            return text;
        }

        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            builder.append(text.charAt(i));

            for (Rule rule : rules) {
                if (builder.length() >= TOKEN_LENGTH) {
                    if (rule.match(builder.charAt(builder.length() - 2), builder.charAt(builder.length() - 1))) {
                        builder.delete(builder.length() - TOKEN_LENGTH, builder.length());
                        break;
                    }
                }
            }
        }

        return builder.toString();
    }

    class ABRule implements Rule {
        private final static String TEXT = "AB";

        @Override
        public boolean match(char first, char second) {
            if (first == second) {
                return false;
            }
            return TEXT.indexOf(first) >= 0 &&
                    TEXT.indexOf(second) >= 0;
        }
    }

    //TODO extract base class
    class CDRule implements Rule {
        private final static String TEXT = "CD";

        @Override
        public boolean match(char first, char second) {
            if (first == second) {
                return false;
            }
            return TEXT.indexOf(first) >= 0 &&
                    TEXT.indexOf(second) >= 0;
        }
    }

    @FunctionalInterface
    interface Rule {
        boolean match(char first, char second);
    }
}
