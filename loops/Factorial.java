import java.util.Scanner;

//to find factorial of a number
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        System.out.println(factorial(n));

    }

    static int factorial(int n) {
        int temp=1;
        for (int i = 1; i <= n; i++) {
            System.out.println(temp);
             temp = temp * i;
        }
    return temp;
    }
}