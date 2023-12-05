package week13;

public class genericNote {
    public static void main(String[] args) {
        genericArray intMethod = new genericArray();
        genericArray genericMethod = new genericArray();

        int[] intArray = {2,9,5,4,7};
        double[] doubleArray = { 1.2,2.9,3.5,4.4,7.7};
        char[] charArray = {'l','i','v','h','e'};
        String[] stringArray = {"boo", "eokjef", "ekfwif", "wfwioefw"};

        intMethod.printArray(intArray);
        Integer[] intarray = {2,9,5,4,7};
        Double[] doublearray = { 1.2,2.9,3.5,4.4,7.7};
        Character[] chararray = {'l','i','v','h','e'};
        String[] stringarray = {"boo", "eokjef", "ekfwif", "wfwioefw"};
        System.out.println();
        System.out.println("integer array");
        genericMethod.printArrayGenerics(intarray);
        System.out.println("double array");
        genericMethod.printArrayGenerics(doublearray);
        System.out.println("char array");
        genericMethod.printArrayGenerics(chararray);
        System.out.println("string array");
        genericMethod.printArrayGenerics(stringarray);
    }
}
