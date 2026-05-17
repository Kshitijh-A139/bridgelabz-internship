import java.util.Scanner;

class Account {
  private String accountHolder;
  private double balance;

  Account(String accountHolder, double initialBalance) {
    this.accountHolder = accountHolder;
    this.balance = initialBalance;
  }

  void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited: " + amount);
  }

  // debit method - withdraws money only if sufficient balance exists
  void debit(double amount) {
    if (amount > balance) {
      System.out.println("Debit amount exceeded account balance. Transaction cancelled.");
    } else {
      balance -= amount;
      System.out.println("Debited: " + amount);
    }
  }

  double getBalance() {
    return balance;
  }

  String getAccountHolder() {
    return accountHolder;
  }

  void printStatement() {
    System.out.println("Account Holder: " + accountHolder);
    System.out.printf("Current Balance: %.2f%n", balance);
  }
}

public class AccountTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter account holder name: ");
    String name = sc.nextLine();

    System.out.print("Enter initial balance: ");
    double initialBalance = sc.nextDouble();

    Account acc = new Account(name, initialBalance);

    System.out.println("\nAccount created!");
    acc.printStatement();

    boolean running = true;
    while (running) {
      System.out.println("\nChoose an option:");
      System.out.println("1. Deposit");
      System.out.println("2. Debit");
      System.out.println("3. Check Balance");
      System.out.println("4. Exit");
      System.out.print("Your choice: ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter deposit amount: ");
          double depositAmt = sc.nextDouble();
          acc.deposit(depositAmt);
          break;
        case 2:
          System.out.print("Enter debit amount: ");
          double debitAmt = sc.nextDouble();
          acc.debit(debitAmt);
          break;
        case 3:
          acc.printStatement();
          break;
        case 4:
          running = false;
          System.out.println("Exiting. Final balance: " + acc.getBalance());
          break;
        default:
          System.out.println("Invalid option. Try again.");
      }
    }

    sc.close();
  }
}