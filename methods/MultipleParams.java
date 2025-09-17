
class MultipleParams {
    public static void main(String[] args) {
        calculate(24, 30);
    }

    static void calculate(double hours, double minutes) {
        double seconds = hours * 60 * 60 + minutes * 60;
        System.out.printf("The total seconds for %.0f hours and %.0f minutes is: %.0f%n", hours, minutes, seconds);
    }
}