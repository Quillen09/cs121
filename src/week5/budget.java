package week5;

import java.util.Scanner;

public class budget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int expenses;
        int totalExpenses = 0;
        int result = 0;
        String input;
        System.out.println("Enter budget");
        int budget = Integer.parseInt(console.nextLine());
        while (true) {
            System.out.println("Enter expenses or q to quit");
            input = console.nextLine();
            if (input.equals("q")) {
                break;
            } else {
                expenses = Integer.parseInt(input);
                totalExpenses = expenses + totalExpenses;
            }
        }
            result = budget - totalExpenses;
            System.out.println("Budget: " + budget);
            System.out.println("Total expenses: " + totalExpenses);
            System.out.println("Amount over or under budget: " + result);
    }
}
