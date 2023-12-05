package week13.genericActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class genericMain {
    public static void main(String[] args) {
        GenericArrayList generic = new GenericArrayList();
        ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Double> doubleArrayList = new ArrayList<>(Arrays.asList(1.1,2.2,3.3,4.4,5.5));
        ArrayList<Character> characterArrayList = new ArrayList<>(Arrays.asList('a','b','c','d','e'));
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("owifobc", "jwnfwbef","wjnfwnf","wenfwof"));
        System.out.println("integer list");
        generic.printArrayList(intArrayList);
        System.out.println("double list");
        generic.printArrayList(doubleArrayList);
        System.out.println("character list");
        generic.printArrayList(characterArrayList);
        System.out.println("string list");
        generic.printArrayList(stringArrayList);
    }
}
