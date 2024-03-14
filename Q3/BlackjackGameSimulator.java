package Q3;

import java.util.Scanner;

/**
 * A simplified Blackjack game simulator.
 */
public class BlackjackGameSimulator {
    /**
     * Simulates a single round of Blackjack.
     *
     * @param scanner The input scanner for player choices.
     */
    public static void playBlackjack(Scanner scanner) {
        Deck deck = new Deck();
        deck.shuffle();

        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();

        // Deal initial cards
        playerHand.addCard(deck.drawCard());
        playerHand.addCard(deck.drawCard());
        if (playerHand.calculateValue() == 21) {
            System.out.println("You win!");
            return;
        }

        dealerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());

        // Display initial hands
        System.out.println("Your hand: " + playerHand);

        // Player's turn
        while (true) {
            System.out.print("Do you want to (1) Hit or (2) Stay? ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                playerHand.addCard(deck.drawCard());
                System.out.println("Your hand: " + playerHand);
                if (playerHand.calculateValue() > 21) {
                    System.out.println("You went over 21. You lose.");
                    return;
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice. Enter 1 for Hit or 2 for Stay.");
            }
        }

        // Dealer's turn
        while (dealerHand.calculateValue() < 17) {
            dealerHand.addCard(deck.drawCard());
        }

        // Determine the winner
        int playerValue = playerHand.calculateValue();
        int dealerValue = dealerHand.calculateValue();

        System.out.println("Your hand: " + playerHand + " (" + playerValue + " points)");
        System.out.println("Dealer's hand: " + dealerHand + " (" + dealerValue + " points)");

        if (dealerValue > 21 || (playerValue <= 21 && playerValue > dealerValue)) {
            System.out.println("You win.");
        } else if (playerValue == dealerValue) {
            System.out.println("It's a tie.");
        } else {
            System.out.println("Dealer wins.");
        }
    }

    /**
     * The main method to start the Blackjack game simulator.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            playBlackjack(scanner);
            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }
        }
        System.out.println("Thanks for playing!");
    }
}
