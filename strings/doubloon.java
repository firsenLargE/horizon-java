
import java.util.Scanner;

/*
 * A word is said to be a “doubloon” if every letter that appears
in the word appears exactly twice. Here are some example doubloons found
in the dictionary:
Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bil-
abial, boob, Caucasus, coco, Dada, deed, Emmett, Hannah, horse-
shoer, intestines, Isis, mama, Mimi, murmur, noon, Otto, papa,
peep, reappear, redder, sees, Shanghaiings, Toto
 */

public class doubloon {
    public static void main(String[] args) {
        System.out.println("Enter word to check doubloon!:");

        Scanner sc = new Scanner(System.in);
        String vic = sc.nextLine();
        System.out.println(isDboubloon(vic));
        sc.close();

    }

    public static boolean isDboubloon(String a) {
        int[] count = new int[250];
        String b = a.toLowerCase();
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (Character.isLetter(c)) {
                count[c - 'a']++;
            }

        }
        for (int counts : count) {
            if (counts != 0 && counts != 2) {
                return false;
            }
        }

        return true;
    }
}
