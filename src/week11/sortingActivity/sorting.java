package week11.sortingActivity;

import java.util.Scanner;

public class sorting {
    public static Scanner console = new Scanner(System.in);
    public int [] array = new int[5];
    public int[] addArray(){
        System.out.println("Enter 5 integers in any order: ");
        for (int i = 0; i< 5; i++){
            array[i] = console.nextInt();
        }
        return array;
    }
    //int temp;
    public int[] sortArray(int[] array){
        int temp = 0;
     for (int i = 0; i < array.length - 1; i++)
     {
         for (int index = 0; index < array.length - i -1; index ++ )
         {
             if (array[index]> array[index+1]){
                 temp = array[index];
                 array[index] = array[index+1];
                 array[index+1] = temp;
             }
         }
     }
        return array;
    }
    public static void printArray(int[] array){
        for (int num: array){
            System.out.printf(num + " ");
        }
        System.out.println();
    }
}
