package week11.sortingActivity;

import static week11.sortingActivity.sorting.printArray;

public class main {
    public static void main(String[] args) {
        sorting unsorted = new sorting();
        sorting sorted = new sorting();
       int[] array = unsorted.addArray();
        int [] sortedArray = sorted.sortArray(array.clone());
        System.out.println("unsorted array: ");
        printArray(array);
        System.out.println("sorted array: ");
        printArray(sortedArray);
    }
}
