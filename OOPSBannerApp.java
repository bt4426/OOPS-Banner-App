public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        // UC4 Implementation using Array and Loop
        String[] banner = {

            "  OOO     OOO    PPPPP    SSSSS ",
            " O   O   O   O   P    P  S      ",
            " O   O   O   O   PPPPP    SSSSS ",
            " O   O   O   O   P            S ",
            "  OOO     OOO    P       SSSSS  "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}