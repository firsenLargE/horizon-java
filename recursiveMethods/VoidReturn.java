package recursivemethods;

public class VoidReturn {

    public static void main(String[] args) {
        countdown(12);
    }
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 2);
        }
    }
}
