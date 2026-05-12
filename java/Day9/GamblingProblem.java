package Day9;

class GamblingGame {
    static final int stake = 100;
    static final int bet = 1;
    static final int days = 20;

    int totalAmount = 0;
    int totalWonDays = 0;
    int totalLostDays = 0;

    int luckiestDay = 0;
    int unluckiestDay = 0;

    int maxWinAmount = 0;
    int maxLossAmount = 0;

    void playGame() {
        int day = 1;
        while(day <= days) {
            int money = stake;
            while(money > 50 && money < 150) {
                int result = (int)(Math.random() * 2);
                if(result == 1) {
                    money = money + bet;
                }
                else {
                    money = money - bet;
                }
            }

            int dailyResult = money - stake;
            totalAmount = totalAmount + dailyResult;
            if(dailyResult > 0) {
                totalWonDays++;
                System.out.println("Day " + day + " Won Amount: $" + dailyResult);
                if(dailyResult > maxWinAmount) {
                    maxWinAmount = dailyResult;
                    luckiestDay = day;
                }
            }
            else {
                totalLostDays++;
                System.out.println("Day " + day + " Lost Amount: $" + dailyResult);
                if(dailyResult < maxLossAmount) {
                    maxLossAmount = dailyResult;
                    unluckiestDay = day;
                }
            }
            day++;
        }
        displayResult();
    }

    void displayResult() {
        System.out.println("\nTotal Amount After 20 Days: $" + totalAmount);
        System.out.println("Total Won Days: " + totalWonDays);
        System.out.println("Total Lost Days: " + totalLostDays);
        System.out.println("Luckiest Day: Day " + luckiestDay +
                " Won $" + maxWinAmount);
        System.out.println("Unluckiest Day: Day " + unluckiestDay +
                " Lost $" + maxLossAmount);
        if(totalAmount > 0) {
            System.out.println("Gambler will Continue Gambling Next Month");
        } else {
            System.out.println("Gambler will Stop Gambling");
        }
    }
}

public class GamblingProblem{
    public static void main(String[] args) {
        GamblingGame gambler = new GamblingGame();
        gambler.playGame();
    }
}