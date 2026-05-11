package Day7;

import java.util.Random;

class Player {
    String name;
    int position;

    Player(String name) {
        this.name = name;
        this.position = 0;
    }
}

public class SnakeAndLadder {

    static final int WINNING_POSITION = 100;
    static Random random = new Random();

    // Method to roll die
    public static int rollDie() {
        return random.nextInt(6) + 1; // 1 to 6
    }

    // Method to check option
    // 0 = No Play
    // 1 = Ladder
    // 2 = Snake
    public static int getOption() {
        return random.nextInt(3);
    }

    // Method to play one turn
    public static boolean playTurn(Player player) {

        int die = rollDie();
        int option = getOption();

        System.out.println("--------------------------------");
        System.out.println(player.name + " rolled : " + die);

        switch (option) {

            case 0:
                System.out.println("Option : No Play");
                break;

            case 1:
                System.out.println("Option : Ladder");

                if (player.position + die <= WINNING_POSITION) {
                    player.position += die;
                }

                System.out.println(player.name + " moved to : " + player.position);

                // Player gets another chance
                if (player.position == WINNING_POSITION) {
                    return true;
                }

                return playTurn(player);

            case 2:
                System.out.println("Option : Snake");

                player.position -= die;

                if (player.position < 0) {
                    player.position = 0;
                }

                System.out.println(player.name + " moved to : " + player.position);
                break;
        }

        // Exact 100 condition
        if (player.position + die == WINNING_POSITION && option != 2) {
            player.position = WINNING_POSITION;
        }

        System.out.println(player.name + " current position : " + player.position);

        return player.position == WINNING_POSITION;
    }

    public static void main(String[] args) {

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        int diceCount = 0;

        System.out.println("Welcome to Snake and Ladder Game");

        while (true) {

            diceCount++;
            System.out.println("\n===== PLAYER 1 TURN =====");

            if (playTurn(player1)) {
                System.out.println("\n*** Player 1 Won the Game ***");
                break;
            }

            diceCount++;
            System.out.println("\n===== PLAYER 2 TURN =====");

            if (playTurn(player2)) {
                System.out.println("\n*** Player 2 Won the Game ***");
                break;
            }
        }

        System.out.println("\nTotal Dice Rolled : " + diceCount);
    }
}