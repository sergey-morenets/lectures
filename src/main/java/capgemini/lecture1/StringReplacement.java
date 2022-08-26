package capgemini.lecture1;

import java.util.List;

public class StringReplacement {


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
    public static String replace(final String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        //TODO add check for [A-D]
        boolean changed = true;
        String current = text;
        while (changed) {
            int length = current.length();
            for (String rule : RULES) {
                current = current.replaceAll(rule, "");
            }
            changed = length != current.length();
        }

        return current;
    }
}
