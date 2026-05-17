import java.util.*;

class Stock {
  String name;
  int quantity;
  double price;

  public Stock(String name, int quantity, double price) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
  }

  public double calculateStockValue() {
    return quantity * price;
  }

  public void display() {
    System.out.println("Stock Name: " + name);
    System.out.println("Quantity: " + quantity);
    System.out.println("Price per Stock: " + price);
    System.out.println("Total Value: " + calculateStockValue());
  }
}

class StockPortfolio {
  ArrayList<Stock> stocks = new ArrayList<>();

  public void addStock(Stock stock) {
    stocks.add(stock);
  }

  public double calculateTotalValue() {
    double total = 0;

    for (Stock stock : stocks) {
      total += stock.calculateStockValue();
    }

    return total;
  }

  public void display() {
    for (Stock stock : stocks) {
      stock.display();
      System.out.println();
    }
    System.out.println("Total Portfolio Value: " + calculateTotalValue());
  }

}

public class StockManagement {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    StockPortfolio portfolio = new StockPortfolio();

    System.out.print("Enter the number of stocks: ");
    int N = scan.nextInt();

    System.out.println("Enter stock details (name, quantity, price):");
    for (int i = 0; i < N; i++) {

      System.out.print("Enter name: ");
      String name = scan.next();

      System.out.print("Enter quantity: ");
      int quantity = scan.nextInt();

      System.out.print("Enter price: ");
      double price = scan.nextDouble();

      scan.nextLine(); // Consume the newline character
      Stock stock = new Stock(name, quantity, price);

      portfolio.addStock(stock);

    }

    portfolio.display();

  }
}