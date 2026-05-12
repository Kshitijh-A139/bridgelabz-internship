package Day9;

class Gambler {

  static final int stake = 100;
  static final int bet = 1;
  static final int days = 20;

  int totalMoney;
  int wondays;
  int lostdays;

  int luckiestDay;
  int unluckiestDay;

  int maxWin = 0;
  int maxLoss = 0;

  void startGambling() {

    for(int day = 1; day <= days; day++) {

      int dailyResult = playForDay();

      totalMoney += dailyResult;

      calculateDayResult(day, dailyResult);
    }

    displayReport();
  }

  int playForDay() {

    int money = stake;

    while(money > 50 && money < 150) {

      int option = (int)(Math.random() * 2);

      if(option == 1) {
        money += bet;
      }
      else {
        money -= bet;
      }
    }

    return money - stake;
  }

  void calculateDayResult(int day, int dailyResult) {

    if(dailyResult > 0) {

      wondays++;

      if(dailyResult > maxWin) {

        maxWin = dailyResult;
        luckiestDay = day;
      }
    }
    else {

      lostdays++;

      if(dailyResult < maxLoss) {

        maxLoss = dailyResult;
        unluckiestDay = day;
      }
    }
  }

  void displayReport() {

    System.out.println("Total Amount: $" + totalMoney);

    System.out.println("Won days: " + wondays);

    System.out.println("Lost days: " + lostdays);

    System.out.println("Luckiest Day: " + luckiestDay);

    System.out.println("Unluckiest Day: " + unluckiestDay);

    if(totalMoney > 0) {
      System.out.println("Continue Gambling");
    }
    else {
      System.out.println("Stop Gambling");
    }
  }
}

public class GamblingProgram {

  public static void main(String[] args) {

    Gambler gambler = new Gambler();

    gambler.startGambling();
  }
}