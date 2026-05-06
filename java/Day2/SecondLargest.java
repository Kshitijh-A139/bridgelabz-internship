package Day2;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {2, 5, 38, 58, 1, 195};

        int max = Integer.MIN_VALUE;
        int second = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                second = max;
                max = arr[i];
            }
        }
        System.out.println("Second largest element: " + second);
    }
}
