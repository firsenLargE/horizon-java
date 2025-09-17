
class MultipleParams {
    public static void main(String[] args) {
        calculate(24, 30);
    }

    static void calculate(int hours, int minutes) {
        double seconds = hours * 60 * 60 + minutes * 60;
        System.out.printf("The total seconds for %d hours and %d minutes is: %.0f%n", hours, minutes, seconds);
    }
}