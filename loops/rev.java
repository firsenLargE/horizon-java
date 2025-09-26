package loops;

import java.util.Scanner;

public class rev {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be reversed!");
        String a =sc.nextLine();
       
        String rev = "";
        for(int i = a.length()-1;i>=0;i--){
            rev += a.charAt(i);
        }
        
        System.out.println(rev);
        
    }
}
