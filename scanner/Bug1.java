package scanner;

import java.util.Scanner;

public class Bug1 {
    public static void main(String[] args) {
      /**   try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your name!");
            String name = input.nextLine();
            
            System.out.println("Enter your age!");
            int age = input.nextInt();
            
            System.out.println("Name and age: " + name + ' ' + age);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
            */


            // if there is string after the integer input then the scanner class throws a bug

            try(Scanner s = new Scanner(System.in)){
                int age;
                String name;
                System.out.println("Enter the age:");
                age = s.nextInt();
                s.nextLine();
                System.out.println("Enter  the name:");
                name = s.nextLine();
                System.out.println("The name and age is:"+name +' '+ age);


            }
            catch(Exception e){
                System.out.println(e);
            }
    }
}