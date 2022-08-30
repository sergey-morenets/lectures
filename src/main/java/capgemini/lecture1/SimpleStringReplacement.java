package capgemini.lecture1;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SimpleStringReplacement implements StringReplacement {


    /**
     * Transforms string by these rules:
     * AB -> ""
     * CD -> ""
     * ABC -> C
     * ABCD -> CD -> ""
     * CABBAD -> CBAD -> CD -> ""
     * BC -> BC
     *
     * @param text Contains only A, B, C or D characters
     * @return
     */

    private static final List<String> RULES = List.of("AB", "BA", "CD", "DC");

    // ABCD, ABC
    // ACDB - incorrect
    public String replace(final String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        //TODO add check for [A-D]
        boolean changed = true;
        String current = text;
        //String pattern = "(AB|BA|CD|DC)";
        String regex = RULES.stream().collect(Collectors.joining("|", "(", ")"));
        Pattern pattern = Pattern.compile(regex);
        while (changed) {
            int length = current.length();
            current = pattern.matcher(current).replaceAll("");
//            for (String rule : RULES) {
//                current = current.replaceAll(rule, "");
//            }
            changed = length != current.length();
        }

        return current;
    }

    public static void main(String[] args) {
        new SimpleStringReplacement().replace("");
    }
}
