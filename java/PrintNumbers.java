import java.util.*;

public class PrintNumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = scan.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
