package week12.activity29;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class restaurantSet {
    Set<Integer> table;
    Scanner console = new Scanner(System.in);
    restaurantSet(){
        this.table = new HashSet<>();
    }
    public void addTable(){
        System.out.println("Enter any number or 0 to quit");
        while(true){
        int newTable = console.nextInt();
        if (newTable == 0){
            break;
        }else {
            table.add(newTable);
        }
    }
}
    public void displayTable(Set<Integer> table){
        
    }
}
