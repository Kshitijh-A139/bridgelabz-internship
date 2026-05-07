package Day3;

public class SumOfNumber {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int i = 0;
        while(i < n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of " + n + " natural numbers: " + sum);
    }
}
