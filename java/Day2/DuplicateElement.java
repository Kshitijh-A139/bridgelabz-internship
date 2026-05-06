package Day2;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[] = {2, 5, 38, 58, 1, 195, 5, 1, 38};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
