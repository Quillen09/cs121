package week4;

import java.util.Scanner;

public class espGame {
    public static void main(String[] args) {
       int correct = 0;
       String guess;
        Scanner console = new Scanner(System.in);
        for(int i = 1; i<= 10; i++){
            System.out.println("Enter a color");
            guess = console.nextLine();
            int compGuess = (int) (Math.random() * 4 + 1);
            if (guess.equals("red") && compGuess == 1){
                correct += 1;
            } else if (guess.equals("green") && compGuess == 2) {
                correct +=1;
            } else if (guess.equals("blue") && compGuess == 3) {
                correct += 1;
            } else if (guess.equals("orange") && compGuess == 4) {
                correct += 1;
            }else if (guess.equals("yellow") && compGuess == 5){
                correct +=1;
            }
            if (compGuess == 1){
                System.out.println("The computer chose red");
            } else if (compGuess == 2) {
                System.out.println("The computer chose green");
            } else if (compGuess == 3) {
                System.out.println("The computer chose blue");
            } else if (compGuess == 4) {
                System.out.println("The computer chose orange");
            } else if (compGuess == 5) {
                System.out.println("The computer chose yellow");
            }
        }
        System.out.println();
        System.out.printf("You got " +correct+ " correct");
    }
}
