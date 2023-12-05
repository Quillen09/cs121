package week12;

import java.util.ArrayList;
import java.util.Arrays;

public class binarySearch {
    public int binarySearch(int key) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(59,23,53,67,21,4,6,78,1,3));
        int counter = 0;
        int low = 0;
        int high = array.size() - 1;
        int mid = (low + high) / 2;
        for (int n : array) {
            System.out.println(n + " ");
        }
       // System.out.printf("\n\tLow index :%d (%d)\tMid index %d (%d)\tHigh index: %d (%d)\n\n",low,);
        return mid;
    }
}