package Day8;

import java.util.Scanner;

public class VendingMachines {
    static int notes[] = {500, 200, 100, 50, 20, 10};

    static int totalNotes = 0;

    static void calculateNotes(int amount, int index) {
        if(amount == 0 || index >= notes.length) {
            return;
        }

        if(amount >= notes[index]) {
            int count = amount / notes[index];

            totalNotes += count;

            System.out.println(notes[index] + "rs notes: " + count);

            amount = amount % notes[index];
        }

        calculateNotes(amount, index + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = scan.nextInt();
        System.out.println("Notes returned: ");
        calculateNotes(amount, 0);
        System.out.println("Minimum number of notes needed: " + totalNotes);

    }
}
