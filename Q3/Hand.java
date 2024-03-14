package Q3;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a hand of playing cards in a Blackjack game.
 */
public class Hand {
    private List<Card> cards = new ArrayList<>();

    /**
     * Adds a card to the hand.
     *
     * @param card The card to be added to the hand.
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Calculates the total value of the hand, considering Aces' flexible values.
     *
     * @return The total value of the hand.
     */
    public int calculateValue() {
        int value = 0;
        int numAces = 0;

        for (Card card : cards) {
            value += card.getValue();
            if (card.getValue() == 11) {
                numAces++;
            }

            while (value > 21 && numAces > 0) {
                value -= 10;
                numAces--;
            }
        }

        return value;
    }

    /**
     * Returns all cards in the hand.
     *
     * @return A list of all cards in the hand.
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Clears the hand by removing all cards.
     */
    public void clear() {
        cards.clear();
    }

    /**
     * Returns a string representation of the hand.
     *
     * @return A string containing the cards in the hand.
     */
    public String toString() {
        return cards.toString();
    }
}
