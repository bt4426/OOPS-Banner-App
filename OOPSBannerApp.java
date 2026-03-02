public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Inline Array Initialization using String.join()
        // This replaces separate population statements for a cleaner look.
        String[] lines = {
            String.join("  ", "*** ", " *** ", " *** ", " **** "),
            String.join("  ", "* *", "* *", "* *", "* "),
            String.join("  ", "* *", "* *", "* *", "* "),
            String.join("  ", "* *", "* *", "* *", " *** "),
            String.join("  ", "* *", "* *", "* *", "    *"),
            String.join("  ", "* *", "* *", "* *", "    *"),
            String.join("  ", "*** ", " *** ", " *** ", "**** ")
        };

        // Use an enhanced for-loop to print the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}