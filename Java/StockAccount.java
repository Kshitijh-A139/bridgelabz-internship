import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;

class CompanyShares {
  String symbol;
  int numberOfShares;
  LocalDateTime transactionTime;

  CompanyShares(String symbol, int numberOfShares) {
    this.symbol = symbol;
    this.numberOfShares = numberOfShares;
    this.transactionTime = LocalDateTime.now();
  }

  String getFormattedTime() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    return transactionTime.format(formatter);
  }
}

public class StockAccount {
  private ArrayList<CompanyShares> holdings = new ArrayList<>();
  private String filename;

  // creates a new account and loads data from file if it exists
  StockAccount(String filename) {
    this.filename = filename;
    loadFromFile();
  }

  private void loadFromFile() {
    File f = new File(filename);
    if (!f.exists()) {
      System.out.println("No existing file found. Starting fresh account.");
      return;
    }
    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] parts = line.split(",");
        if (parts.length == 2) {
          String symbol = parts[0].trim();
          int shares = Integer.parseInt(parts[1].trim());
          CompanyShares cs = new CompanyShares(symbol, shares);
          holdings.add(cs);
        }
      }
      System.out.println("Account loaded from file: " + filename);
    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    }
  }

  double valueOf() {
    double total = 0;
    for (CompanyShares cs : holdings) {
      total += cs.numberOfShares * 100.0;
    }
    return total;
  }

  void buy(int amount, String symbol) {
    for (CompanyShares cs : holdings) {
      if (cs.symbol.equalsIgnoreCase(symbol)) {
        cs.numberOfShares += amount;
        cs.transactionTime = LocalDateTime.now();
        System.out.println("Bought " + amount + " more shares of " + symbol);
        return;
      }
    }
    holdings.add(new CompanyShares(symbol, amount));
    System.out.println("Bought " + amount + " shares of " + symbol + " (new entry)");
  }

  void sell(int amount, String symbol) {
    for (CompanyShares cs : holdings) {
      if (cs.symbol.equalsIgnoreCase(symbol)) {
        if (cs.numberOfShares < amount) {
          System.out.println("Not enough shares to sell. You only have " + cs.numberOfShares);
        } else {
          cs.numberOfShares -= amount;
          cs.transactionTime = LocalDateTime.now();
          System.out.println("Sold " + amount + " shares of " + symbol);
          if (cs.numberOfShares == 0) {
            holdings.remove(cs);
            System.out.println("No more shares of " + symbol + " in portfolio.");
          }
        }
        return;
      }
    }
    System.out.println("You don't hold any shares of " + symbol);
  }

  void save(String filename) {
    try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
      for (CompanyShares cs : holdings) {
        pw.println(cs.symbol + "," + cs.numberOfShares);
      }
      System.out.println("Account saved to " + filename);
    } catch (IOException e) {
      System.out.println("Error saving file: " + e.getMessage());
    }
  }

  void printReport() {
    System.out.println("\n======= Stock Account Report =======");
    if (holdings.isEmpty()) {
      System.out.println("No holdings found.");
    } else {
      System.out.printf("%-10s %-10s %-25s %-12s%n", "Symbol", "Shares", "Transaction Time", "Value");
      System.out.println("--------------------------------------------------------------");
      for (CompanyShares cs : holdings) {
        double val = cs.numberOfShares * 100.0;
        System.out.printf("%-10s %-10d %-25s %-12.2f%n",
            cs.symbol, cs.numberOfShares, cs.getFormattedTime(), val);
      }
      System.out.println("--------------------------------------------------------------");
      System.out.printf("Total Account Value: %.2f%n", valueOf());
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter account filename (e.g. myaccount.txt): ");
    String file = sc.nextLine();

    StockAccount account = new StockAccount(file);

    boolean running = true;
    while (running) {
      System.out.println("StockAccount Menu");
      System.out.println("1. Buy shares");
      System.out.println("2. Sell shares");
      System.out.println("3. View total value");
      System.out.println("4. Print full report");
      System.out.println("5. Save account");
      System.out.println("6. Exit");
      System.out.print("Choice: ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          System.out.print("Enter stock symbol: ");
          String buySymbol = sc.nextLine();
          System.out.print("Enter number of shares to buy: ");
          int buyAmt = sc.nextInt();
          sc.nextLine();
          account.buy(buyAmt, buySymbol);
          break;
        case 2:
          System.out.print("Enter stock symbol: ");
          String sellSymbol = sc.nextLine();
          System.out.print("Enter number of shares to sell: ");
          int sellAmt = sc.nextInt();
          sc.nextLine();
          account.sell(sellAmt, sellSymbol);
          break;
        case 3:
          System.out.printf("Total account value: %.2f%n", account.valueOf());
          break;
        case 4:
          account.printReport();
          break;
        case 5:
          System.out.print("Enter filename to save: ");
          String saveFile = sc.nextLine();
          account.save(saveFile);
          break;
        case 6:
          running = false;
          System.out.println("Program exited.");
          break;
        default:
          System.out.println("Invalid choice.");
      }
    }

    sc.close();
  }
}