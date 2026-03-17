import java.util.*;

public class OOPSBannerApp {

    // Static method to build character patterns using HashMap
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // O Pattern
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // P Pattern
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // S Pattern
        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return patternMap;
    }

    // Static method to render banner
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int height = 5; // number of rows in each character

        for (int i = 0; i < height; i++) { // outer loop for rows

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) { // inner loop for characters

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}
