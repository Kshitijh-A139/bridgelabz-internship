package Day8;

import java.util.Scanner;

class NibbleUtil {
    static void swapNibble(int number) {
        int result = ((number & 15) << 4) | ((number & 240) >> 4);
        System.out.println("After Swapping Nibbles: " + result);
    }
}

public class Nibble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scan.nextInt();
        NibbleUtil.swapNibble(number);
    }
}