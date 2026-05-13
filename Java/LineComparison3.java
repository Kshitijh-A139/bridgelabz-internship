import java.util.Scanner;

class Point {
  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Line implements Comparable<Line> {
  Point p1;
  Point p2;
  double length;

  Line(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
    this.length = calculateLength();
  }

  public double calculateLength() {
    return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Line other = (Line) obj;

    return Double.compare(this.length, other.length) == 0;
  }

  @Override
  public int compareTo(Line other) {
    return Double.compare(this.length, other.length);
  }

  // Display Method
  public void displayLine() {
    System.out.println("Line Length : " + length);
  }
}

public class LineComparison3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Line Comparison Computation Program");

    System.out.println("Enter first line corrdinates: ");

    System.out.print("Enter x1: ");
    int x1 = scan.nextInt();

    System.out.print("Enter y1: ");
    int y1 = scan.nextInt();

    System.out.print("Enter x2: ");
    int x2 = scan.nextInt();

    System.out.print("Enter y2: ");
    int y2 = scan.nextInt();

    System.out.println("Enter second line coordinates: ");

    System.out.print("Enter x3: ");
    int x3 = scan.nextInt();

    System.out.print("Enter y3: ");
    int y3 = scan.nextInt();

    System.out.print("Enter x4: ");
    int x4 = scan.nextInt();

    System.out.print("Enter y4: ");
    int y4 = scan.nextInt();

    Point p1 = new Point(x1, y1);
    Point p2 = new Point(x2, y2);

    Point p3 = new Point(x3, y3);
    Point p4 = new Point(x4, y4);

    Line line1 = new Line(p1, p2);
    Line line2 = new Line(p3, p4);

    System.out.println("Length of line 1: ");
    line1.displayLine();

    System.out.println("Length of line 2: ");
    line2.displayLine();

    if (line1.equals(line2)) {
      System.out.println("Lines are equal.");
    } else {
      System.out.println("Lines are not equal.");
    }

    int result = line1.compareTo(line2);

    if (result > 0) {
      System.out.println("Line 1 is longer than line 2");
    } else if (result < 0) {
      System.out.println("Line 1 is shorter than line 2");
    } else {
      System.out.println("Both lines are of equal length");
    }

  }
}