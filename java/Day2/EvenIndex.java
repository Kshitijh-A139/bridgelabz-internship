package Day2;

public class EvenIndex {
    public static void main(String[] args) {
        int arr[] = {2, 5, 38, 58, 1, 195};

        for (int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }
}
