import java.util.Random;

class CardNode {
  String card;
  CardNode next;

  CardNode(String card) {
    this.card = card;
    this.next = null;
  }
}

class CardQueue {
  private CardNode head;
  private CardNode tail;
  private int size;

  void enqueue(String card) {
    CardNode newNode = new CardNode(card);
    if (tail == null) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }

  String dequeue() {
    if (head == null)
      return null;
    String card = head.card;
    head = head.next;
    if (head == null)
      tail = null;
    size--;
    return card;
  }

  int size() {
    return size;
  }

  String[] toArray() {
    String[] arr = new String[size];
    CardNode curr = head;
    int i = 0;
    while (curr != null) {
      arr[i++] = curr.card;
      curr = curr.next;
    }
    return arr;
  }

  void rebuildFromArray(String[] arr) {
    head = tail = null;
    size = 0;
    for (String s : arr) {
      enqueue(s);
    }
  }
}

class Player {
  String name;
  CardQueue hand;

  Player(String name) {
    this.name = name;
    this.hand = new CardQueue();
  }

  void receiveCard(String card) {
    hand.enqueue(card);
  }

  void sortByRank() {
    String[] rankOrder = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

    String[] cards = hand.toArray();

    for (int i = 0; i < cards.length - 1; i++) {
      for (int j = 0; j < cards.length - i - 1; j++) {
        int rankA = getRankIndex(cards[j], rankOrder);
        int rankB = getRankIndex(cards[j + 1], rankOrder);
        if (rankA > rankB) {
          String temp = cards[j];
          cards[j] = cards[j + 1];
          cards[j + 1] = temp;
        }
      }
    }

    hand.rebuildFromArray(cards);
  }

  private int getRankIndex(String card, String[] rankOrder) {
    String rank = card.split(" of ")[0];
    for (int i = 0; i < rankOrder.length; i++) {
      if (rankOrder[i].equals(rank))
        return i;
    }
    return -1;
  }

  void printHand() {
    System.out.println(name + "'s cards (sorted by rank):");
    String[] cards = hand.toArray();
    for (int i = 0; i < cards.length; i++) {
      System.out.println("  " + (i + 1) + ". " + cards[i]);
    }
  }
}

class PlayerNode {
  Player player;
  PlayerNode next;

  PlayerNode(Player player) {
    this.player = player;
    this.next = null;
  }
}

class PlayerQueue {
  private PlayerNode head;
  private PlayerNode tail;
  private int size;

  void enqueue(Player player) {
    PlayerNode node = new PlayerNode(player);
    if (tail == null) {
      head = tail = node;
    } else {
      tail.next = node;
      tail = node;
    }
    size++;
  }

  Player dequeue() {
    if (head == null)
      return null;
    Player p = head.player;
    head = head.next;
    if (head == null)
      tail = null;
    size--;
    return p;
  }

  int size() {
    return size;
  }

  Player[] toArray() {
    Player[] arr = new Player[size];
    PlayerNode curr = head;
    int i = 0;
    while (curr != null) {
      arr[i++] = curr.player;
      curr = curr.next;
    }
    return arr;
  }
}

public class DeckOfCards2 {

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
    shuffleDeck(deck);

    System.out.println("Deck shuffled. Distributing 9 cards to 4 players...\n");

    PlayerQueue playerQueue = new PlayerQueue();
    playerQueue.enqueue(new Player("Player 1"));
    playerQueue.enqueue(new Player("Player 2"));
    playerQueue.enqueue(new Player("Player 3"));
    playerQueue.enqueue(new Player("Player 4"));

    int cardsEach = 9;
    Player[] players = playerQueue.toArray();

    int cardIndex = 0;
    for (int i = 0; i < cardsEach; i++) {
      for (Player p : players) {
        p.receiveCard(deck[cardIndex++]);
      }
    }

    for (Player p : players) {
      p.sortByRank();
      p.printHand();
      System.out.println();
    }

    System.out.println("All " + playerQueue.size() + " players have received and sorted their cards.");
  }
}