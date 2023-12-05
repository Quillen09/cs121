package week4;

import java.util.Scanner;

public class testAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of students");
        int students = console.nextInt();
        System.out.println("Enter number of tests per student");
        int tests = console.nextInt();
        int scoreTotal = 0;
        double scoreAverage = 0;
        int score;
        for(int i = 1; i <= students; i++){
            for (int j = 1; j <= tests; j++){
                System.out.printf("Enter test score for test "+j);
                System.out.println();
                score = console.nextInt();
                scoreTotal = score + scoreTotal;
            }
            scoreAverage = (double) scoreTotal / tests;
            System.out.printf("Score average for student " +i+": "+ scoreAverage+"\n");
            scoreTotal = 0;
            scoreAverage = 0;
        }
    }
}
