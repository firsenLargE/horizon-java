
import java.util.Scanner;

public class Copy {
    
    public static void main(String[] args) {
        int[] abc = new int[22];
        copy(abc);
        
    }

    public static void copy(int[] a ){
        int[] arr  = new int[22];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int[] b= new int[22];
        for(int i =0;i<3;i++){
          b[i] =  arr[i];
        }
        for(int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }


        
    }
}
