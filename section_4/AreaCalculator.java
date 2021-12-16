public class AreaCalculator {

    public static void main(String[] args) {
        var a = area(0);
        var b = area(0,0);
        int end;
    }

    public static double area(double radius) {
        if (radius < 0)
            return -1.0;
        return Math.pow(radius, 2.0) * Math.PI;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0))
            return -1.0;
        return x * y;
    }
}
