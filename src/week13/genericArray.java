package week13;

public class genericArray {
    public void printArray(int [] inputArray){
        for (int element : inputArray){
            System.out.println(element+" ");
        }
        System.out.println();
    }
    public <E> void printArrayGenerics(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
}
