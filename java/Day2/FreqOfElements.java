package Day2;

import java.util.HashMap;
import java.util.Map;

public class FreqOfElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1, 4, 1, 3, 2};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(visited[i]) continue;

            int count = 1;
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Element: " + arr[i] + " Frequency: " + count);
        }

    }
}
