package Day2;

public class OddIndex {
    public static void main(String[] args) {
        int arr[] = {2, 5, 38, 58, 1, 195};

        for (int i = 1; i < arr.length; i+=2) {
            System.out.println(arr[i]);
        }
    }
}
