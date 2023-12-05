package week4;

import java.util.Scanner;

public class averageRainfall {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of years");
        int years = console.nextInt();
        int inches;
        int totalInches = 0;
        double averageInches = 0;
        int months = 0;
        for(int i = 1; i <= years; i++){
            for(int j = 1; j <= 12; j++){
                System.out.println("Enter number of inches of rainfall for month "+j);
                inches = console.nextInt();
                totalInches = inches+totalInches;
            }
            months = i * 12;
            averageInches = (double) totalInches / months;
        }
        System.out.println("Number of months: "+months);
        System.out.println("Total rainfall: "+totalInches);
        System.out.println("Average rainfall: "+averageInches);
    }
}
