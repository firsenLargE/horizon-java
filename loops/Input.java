package loops;


import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the next user's id:");
        while(!in.hasNextDouble()){
             String id = in.next();
             System.err.println(id+":is not an id!!");
             System.out.println("Enter the id");

        }

    
    }
}
