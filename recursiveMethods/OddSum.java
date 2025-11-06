package recursiveMethods;


import java.util.Scanner;

//given task to find the sum of odd integers from 0-n  through recursion
public class OddSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int temp = s.nextInt();
        System.out.println(oddSum(temp));

    }

        static int oddSum(int n) {
            if (n <= 0)
                return 0;

            if (n % 2 == 1)  // if n is odd
                return n + oddSum(n - 2);
            else             // if n is even
                return oddSum(n - 1);
        }
    }


