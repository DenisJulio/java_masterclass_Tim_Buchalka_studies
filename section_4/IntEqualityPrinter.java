public class IntEqualityPrinter {

    public static void printEqual(int a, int b, int c) {
        if (a < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (b < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (c < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (a == b) {
            if (a == c) {
                System.out.println("All numbers are equal");
            } else {
                System.out.println("Neither all are equal or different");
            }
        } else {
            if (a != c && c != b) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
