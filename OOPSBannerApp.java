public class OOPSBannerApp {

    // Static method for letter O
    static String[] getOPattern() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    // Static method for letter P
    static String[] getPPattern() {
        return new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    // Static method for letter S
    static String[] getSPattern() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*       ",
                " *****  ",
                "      * ",
                "*     * ",
                " *****  "
        };
    }

    public static void main(String[] args) {

        // Calling static helper methods
        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Loop-based rendering
        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}
