package Q3;

/**
 * Represents a playing card in a standard deck of cards.
 */
public class Card {
    private String suit;
    private String rank;
    private int value;

    /**
     * Creates a new card with the specified suit, rank, and point value.
     *
     * @param suit  The suit of the card (e.g., "Hearts", "Diamonds").
     * @param rank  The rank of the card (e.g., "2", "King", "Ace").
     * @param value The point value of the card.
     */
    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    /**
     * Gets the point value of the card.
     *
     * @return The point value of the card.
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns a string representation of the card.
     *
     * @return A string containing the rank and suit of the card.
     */
    public String toString() {
        return rank + " of " + suit;
    }
}
