package week13;

import java.util.LinkedList;

public class linkedNote {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("a");
        name.add("b");
        name.add("c");
        name.add("d");
        name.add("e");
        System.out.println(name);
        name.add(2,"f");
        System.out.println(name);
        System.out.println(name.get(5));
        name.set(0, "g");
        System.out.println(name);
    }
}
