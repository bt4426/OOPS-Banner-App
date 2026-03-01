/**
 * OOPSBannerApp - UC3: Render OOPS Banner using String.join()
 *
 * This version refactors UC2 implementation by replacing
 * string concatenation (+) with String.join() method.
 *
 * Benefits:
 * - Reduces intermediate String object creation
 * - Improves memory efficiency
 * - Enhances readability
 *
 * @author Tharun
 * @version 3.0
 */

public class OOPSBannerApp {

    // Static method to print OOPS banner
    public static void printBanner() {

        System.out.println(String.join(" ",
                " *****  ",
                " *****  ",
                " *****  ",
                " *****  "
        ));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * "
        ));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * "
        ));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        ));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "      * "
        ));

        System.out.println(String.join(" ",
                "*     * ",
                "*     * ",
                "*     * ",
                "      * "
        ));

        System.out.println(String.join(" ",
                " *****  ",
                " *****  ",
                " *****  ",
                " *****  "
        ));
    }

    public static void main(String[] args) {
        printBanner();
    }
}