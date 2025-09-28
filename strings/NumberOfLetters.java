
import java.util.Scanner;

//suppose we are given a word of length n and we have to find the number of particular words in the given word

public class NumberOfLetters {
    public static void main(String[] args) {

        countLetter();

    }

    public static void countLetter() {
        System.out.println("Enter the word to compute:");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println("Enter the letter to count:");
        char letter = sc.next().charAt(0);

        String start = word.toLowerCase();
        char end = Character.toLowerCase(letter);

        int count = 0;
        for (int i = 0; i < start.length(); i++) {
            
            
            
        }
        System.out.println("Total number" + letter +"has been repeated is :"+count);

    }

}
