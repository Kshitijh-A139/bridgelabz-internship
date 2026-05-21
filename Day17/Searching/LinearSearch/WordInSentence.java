package Searching.LinearSearch;

import java.util.Scanner;

public class WordInSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        String arr[] = sentence.split(" ");

        System.out.print("Enter a word to search in the sentence: ");
        String word = scan.next();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(word)) {
                System.out.println("Word found at index " + i);
            }
        }
    }
}
