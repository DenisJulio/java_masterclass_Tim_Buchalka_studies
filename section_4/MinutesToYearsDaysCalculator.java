public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long totalDays = minutes / 1440;
        int years = (int) (totalDays / 365);
        long days = totalDays % 365;
        System.out.println(String.format("%s min = %s y and %s d", minutes, years, days));
    }

}
