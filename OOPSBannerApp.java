public class OOPSBannerApp {

    // 1. Define separate static methods for each character pattern
    public static String[] getOPattern() {
        return new String[] {
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        };
    }

    public static String[] getPPattern() {
        return new String[] {
            " **** ",
            " * * ",
            " * * ",
            " **** ",
            " * ",
            " * ",
            " * "
        };
    }

    public static String[] getSPattern() {
        return new String[] {
            "  **** ",
            " * ",
            " * ",
            "  *** ",
            "     * ",
            "     * ",
            " **** "
        };
    }

    public static void main(String[] args) {
        // 2. Call the methods to get the patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // 3. Use a loop to assemble and print each line of the banner
        for (int i = 0; i < 7; i++) {
            // We print O, O, P, and S side-by-side
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}