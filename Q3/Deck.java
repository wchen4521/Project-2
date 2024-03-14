package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a standard deck of playing cards.
 */
public class Deck {
    private List<Card> cards;

    /**
     * Creates a new standard deck of playing cards.
     */
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                int value = i < 9 ? i + 2 : 10;
                if (ranks[i].equals("Ace")) {
                    value = 11;
                }
                cards.add(new Card(suit, ranks[i], value));
            }
        }
    }

    /**
     * Shuffles the deck of cards to randomize their order.
     */
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cards.size(); i++) {
            int j = rand.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    /**
     * Draws a card from the deck.
     *
     * @return The drawn card, or null if the deck is empty.
     */
    public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}
