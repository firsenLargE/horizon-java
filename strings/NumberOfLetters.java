
import java.util.Scanner;

//suppose we are given a word of length n and we have to find the number of particular words in the given word


public class NumberOfLetters {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = in.nextLine();
        System.out.println("Enter the letter to count:");
        String letter = in.next();

        String toCheck = word.toLowerCase();

        for(char c = 'a';c<='z';c++){
            int total = 0 ;
            for(int i = 0;i<toCheck.length();i++){
                if(letter == c){
                    total++;
                }
                System.out.println(total);
            }
            


        }
        

    }
}
