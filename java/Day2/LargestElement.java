package Day2;

public class LargestElement
{
    public static void main(String[] args) {
        int arr[] = {2, 5, 38, 58, 1, 195};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }
}
