****Design:****
The program consists of several classes, including Card, Deck, Hand, and BlackjackGameSimulator. Each class serves a specific purpose in the simulation of a single round of Blackjack. Card Class

****Card Class****
 *Description
The Card class represents a playing card in a standard deck of cards. It includes attributes for the card's suit, rank, and point value.
 *Design Choices
1. Fields: The class includes private fields to store the suit, rank, and point value of the card.
2.Constructor: The constructor allows the creation of a Card with specific suit, rank, and point value.
3.Accessors: A method to retrieve the point value of the card is provided.
4.toString() Method: The toString() method generates a string representation of the card, including the rank and suit. Deck Class

****Deck Class****
 *Description
The Deck class represents a standard deck of playing cards. It includes methods for creating and shuffling a deck, as well as drawing cards from the deck.
 *Design Choices
1.Fields: The class includes a list of Card objects representing the deck.
2.Constructor: The constructor creates a new standard deck of playing cards, populating the list with cards of different suits, ranks, and point values.
3.shuffle() Method: The shuffle() method randomizes the order of cards in the deck.
4.drawCard() Method: This method allows drawing a card from the deck. It returns the drawn card or null if the deck is empty.

****Hand Class****
 *Description
The Hand class represents a hand of playing cards in a Blackjack game. It includes methods for adding cards to the hand, calculating the hand's total value with flexible Ace values, and clearing the hand.
 *Design Choices
1.Fields: The class includes a list of Card objects representing the hand.
2.addCard() Method: This method allows adding a card to the hand.
3.calculateValue() Method: The calculateValue() method calculates the total value of the hand, considering Aces' flexible values (1 or 11).
4.getCards() Method: This method returns all cards in the hand.
5.clear() Method: The clear() method removes all cards from the hand
6.toString() Method: The toString() method returns a string representation of the hand, showing the cards in the hand.

****BlackjackGameSimulator Class****
 *Description
The BlackjackGameSimulator class is the main class responsible for simulating a single round of Blackjack. It allows the player to play the game, make choices, and displays the result.
 *Design Choices
1.playBlackjack() Method: This method simulates a single round of Blackjack. It initializes the deck, deals initial cards, handles the player's and dealer's turns, and determines the winner.
2.Main Method: The main() method serves as the entry point of the program. It contains the game loop, allowing the player to play multiple rounds and exit when desired.
3.Input Handling: The Scanner class is used to handle player input for hitting or staying in the game.
