public class Cards {

    int rank;
    int suit;

    public static void main(String[] args) {
        Cards card = new Cards();
        card.rank = 1; // Ace
        card.suit = 2; // Hearts
        System.out.println(card.toString());
    }

    @Override
    public String toString() {
        String[] suits = {"Clubs","Spades","Hearts","Diamonds"};
        String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Jack", "Queen", "King"};
        return ranks[this.rank] + " of " + suits[this.suit];
    }
}
