package week12;

import java.util.HashSet;
import java.util.Set;

public class setNotes {
    public static void main(String[] args) {
        Set<Integer> tablenum = new HashSet<>();
        tablenum.add(19);
        tablenum.add(2);
        tablenum.add(4);
        tablenum.add(8);
        System.out.println(tablenum);
        tablenum.remove(19);
        System.out.println(tablenum);
        //.size()
        //.contains() - true or false is object is or isn't in set
        //.isEmpty() - true or false
        //.clear() - clears everything in set

    }
}

