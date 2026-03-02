public class OOPSBannerApp {

    // Helper method to generate the pattern for 'O'
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "* *",
            "* *",
            "* *",
            "* *",
            "* *",
            " *** "
        };
    }

    // Helper method to generate the pattern for 'P'
    public static String[] getPPattern() {
        return new String[] {
            "**** ",
            "* *",
            "* *",
            "**** ",
            "* ",
            "* ",
            "* "
        };
    }

    // Helper method to generate the pattern for 'S'
    public static String[] getSPattern() {
        return new String[] {
            " **** ",
            "* ",
            "* ",
            " *** ",
            "    * ",
            "    * ",
            "**** "
        };
    }

    public static void main(String[] args) {
        // Fetch patterns using helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print the banner "OOPS" using a loop
        // We combine the strings row by row (7 rows total)
        for (int i = 0; i < 7; i++) {
            System.out.println(
                oPattern[i] + "  " + 
                oPattern[i] + "  " + 
                pPattern[i] + "  " + 
                sPattern[i]
            );
        }
    }
}