package TimeComplexity;

import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureSearch {
    public static void main(String[] args) {
        int arr[] = new int[100000];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 100000; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = 99999;
        long arrayStart = System.nanoTime();
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        long arrayEnd = System.nanoTime();
        long hashStart = System.nanoTime();
        hashSet.contains(target);
        long hashEnd = System.nanoTime();
        long treeStart = System.nanoTime();
        treeSet.contains(target);
        long treeEnd = System.nanoTime();
        System.out.println("Array Search Time: " + (arrayEnd - arrayStart) + " ns");
        System.out.println("HashSet Search Time: " + (hashEnd - hashStart) + " ns");
        System.out.println("TreeSet Search Time: " + (treeEnd - treeStart) + " ns");
    }
}