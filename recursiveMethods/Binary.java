package recursiveMethods;


import java.util.Scanner;
class Binary{
public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
System.out.print("Enter the integer:");
int n = s.nextInt();
System.out.println(binary(n));
    
}


// this method should return the binary of the given integer
public static String binary(int n){


    if(n==0){
        return "";
    };
    return binary(n/2) + n%2;


}
}