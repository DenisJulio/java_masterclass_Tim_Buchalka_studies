public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(218123456301L);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        System.out.println(String.format("%s min = %s y and %s d", ((hours % 24) * 60) + (minutes % 60), years, days));
    }

}
