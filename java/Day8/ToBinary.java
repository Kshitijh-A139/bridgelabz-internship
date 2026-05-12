package Day8;

import java.util.Scanner;

class BinaryUtil {
    static void toBinary(int number) {

        int binary[] = new int[32];
        int index = 0;

        while(number > 0) {
            binary[index] = number % 2;
            number = number / 2;
            index++;
        }

        System.out.print("Binary: ");
        for(int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}

public class ToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scan.nextInt();
        BinaryUtil.toBinary(number);
    }
}