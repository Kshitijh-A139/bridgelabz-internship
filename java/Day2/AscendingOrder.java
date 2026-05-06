package Day2;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int arr[] = {2, 5, 38, 58, 1, 195};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
