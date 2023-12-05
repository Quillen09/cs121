package week4;

import java.util.Scanner;

public class guessGame {
    public static void main(String[] args) {
        int guess = 0;
        String input;
        int num;
        int correct = 78;
        Scanner console = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number or q to quit");
            input = console.nextLine();
            if (input.equals("q")){
                System.out.println("Answer was 78");
                break;
            }else{ num = Integer.parseInt(input);
            if (num == correct){
                System.out.println("Correct");
                break;
            } else if (num < correct) {
                System.out.println("Too low, try again");
            } else if (num > correct) {
                System.out.println("Too high try again");
            }
        }
            guess++;
    }
        System.out.printf("Your guesses: "+guess);
}}
