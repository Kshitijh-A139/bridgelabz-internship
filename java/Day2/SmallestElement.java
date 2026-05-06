package Day2;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[] = {2, 5, 38, 58, 1, 195};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in the array: " + min);
    }
}
