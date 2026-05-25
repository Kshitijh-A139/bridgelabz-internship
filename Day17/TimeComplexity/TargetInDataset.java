package TimeComplexity;

public class TargetInDataset {
    public static void main(String[] args) {
        int arr[] = {4, 28, 85, 285, 73, 385, 80, 835, 25, 49};
        int target = 385;

        long linearStartTime = System.nanoTime();
        int linearResult = linearSearch(arr, target);
        long linearEndTime = System.nanoTime();
        long linearTime = linearEndTime - linearStartTime;

        long binaryStartTime = System.nanoTime();
        int binaryResult = binarySearch(arr, target);
        long binaryEndTime = System.nanoTime();
        long binaryTime = binaryEndTime - binaryStartTime;


        if(linearResult != -1) {
            System.out.println("Linear search: " + target + " is present at index " + linearResult + " with time complexity " + linearTime + "ns");
        } else {
            System.out.println("Linear search: " + target + " is not present.");
        }

        if(binaryResult != -1) {
            System.out.println("Binary search: " + target + " is present at index " + binaryResult + " with time complexity " + binaryTime + "ns");
        } else {
            System.out.println("Binary search: " + target + " is not present.");
        }
    }

    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
