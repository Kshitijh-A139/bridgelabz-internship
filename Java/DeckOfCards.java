import java.util.Random;

public class DeckOfCards {

  static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
  static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

  static String[] buildDeck() {
    String[] deck = new String[52];
    int index = 0;
    for (String suit : suits) {
      for (String rank : ranks) {
        deck[index++] = rank + " of " + suit;
      }
    }
    return deck;
  }

  static void shuffleDeck(String[] deck) {
    Random rand = new Random();
    for (int i = deck.length - 1; i > 0; i--) {
      int j = rand.nextInt(i + 1);
      String temp = deck[i];
      deck[i] = deck[j];
      deck[j] = temp;
    }
  }

  public static void main(String[] args) {
    String[] deck = buildDeck();

    System.out.println("Deck built with " + deck.length + " cards.");
    System.out.println("Shuffling...\n");
    shuffleDeck(deck);

    int numPlayers = 4;
    int cardsEach = 9;

    String[][] playerCards = new String[numPlayers][cardsEach];

    int cardIndex = 0;
    for (int i = 0; i < numPlayers; i++) {
      for (int j = 0; j < cardsEach; j++) {
        playerCards[i][j] = deck[cardIndex++];
      }
    }

    for (int i = 0; i < numPlayers; i++) {
      System.out.println("Player " + (i + 1) + " received:");
      for (int j = 0; j < cardsEach; j++) {
        System.out.println("  " + (j + 1) + ". " + playerCards[i][j]);
      }
      System.out.println();
    }

    System.out.println("Cards distributed. Remaining in deck: " + (deck.length - numPlayers * cardsEach));
  }
}