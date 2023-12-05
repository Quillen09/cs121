package week9;

import java.util.Scanner;

public class arrayFromInput {
    public static void main(String[] args) {
        int [] tableCap = new int[3];
        String [] tableSize = new String[3];
        String [] tableAvail = new String[3];
        Scanner console = new Scanner(System.in);
        for(int i = 0; i<3; i++){
        System.out.println("Enter table availability: ");
        tableAvail[i] = console.nextLine();
        System.out.println("Enter table size: ");
        tableSize[i]= console.nextLine();
        System.out.println("Enter table capacity: ");
        tableCap[i] = Integer.parseInt(console.nextLine());
    }
        System.out.println("Table availability\tTable size\tTable capacity");
    for(int i = 0; i < tableAvail.length; i++){
        System.out.println(tableAvail[i]+"\t\t"+ tableSize[i]+"\t\t"+ tableCap[i]);
    }
}}
