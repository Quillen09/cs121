package week13.genericActivity;

import java.util.ArrayList;

public class GenericArrayList {
    public <E> void printArrayList(ArrayList<E> inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
