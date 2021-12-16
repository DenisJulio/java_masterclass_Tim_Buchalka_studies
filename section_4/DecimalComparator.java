public class DecimalComparator {

    public static void main(String[] args) {
        var a = -3.175;
        var b = -3.17;
        var res = areEqualByThreeDecimalPlaces(a, b);
        System.out.println(res);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        double res = Math.abs(a - b);
        return res < 0.0009;
    }
}
