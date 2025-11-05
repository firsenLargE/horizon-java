package recursiveMethods;

/*
given a phrase below
task : to continue the phrase till are 0 bottles of beer::!!


99 bottles of beer on the wall,
99 bottles of beer,
ya’ take one down, ya’ pass it around,
98 bottles of beer on the wall.

 */
public class BeerBottle {
    public static void main(String[] args) {
        beerBottles(99);
    }
    public static void beerBottles(int n) {

        if (n == 1) {
            System.out.println(n + " bottles of beer on the wall,\n" + n +
                    " bottles of beer,\n" +
                    "ya’ take one down, ya’ pass it around,\n" + (n - 1) +
                    " bottles of beer on the wall.");
            return;
        }
        System.out.println(n + " bottles of beer on the wall,\n" + n +
                " bottles of beer,\n" +
                "ya’ take one down, ya’ pass it around,\n" + (n - 1) +
                " bottles of beer on the wall.");

        beerBottles(n-1);
    }


}
