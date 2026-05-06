package Day2;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2, 5, 38, 58, 1, 195};

        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
