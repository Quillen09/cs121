package project1;

import java.util.Scanner;

public class CharacterBattle {
   static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter an odd number of rounds: ");
        int rounds = Integer.parseInt(console.nextLine());

        int player1wins = 0;
        int player2wins = 0;
        for (int i = 1; i <= rounds; i++) {
            if (rounds % 2 == 0){
                break;
            }
            String charaName1;
            String charaMove1;
            int charaAttack1;
            int charaHP1;
            int charaSpeed1;
            String charaName2;
            String charaMove2;
            int charaAttack2;
            int charaHP2;
            int charaSpeed2;

            System.out.println("Player 1: ");
            charaName1 = assignName();
            charaMove1 = assignMove();
            charaAttack1 = assignAttack();
            charaHP1 = assignHP();
            charaSpeed1 = assignSpeed();
            System.out.println("Player 2: ");

            charaName2 = assignName();
            charaMove2 = assignMove();
            charaAttack2 = assignAttack();
            charaHP2 = assignHP();
            charaSpeed2 = assignSpeed();

            while (charaHP1 >= 0 && charaHP2 >= 0) {
                if (charaSpeed1 == charaSpeed2){
                    charaSpeed1 = (int)(Math.random() * (10 - 1)) + 1;
                    charaSpeed2 = (int)(Math.random() * (10 - 1)) + 1;
                }
                if (charaSpeed1 > charaSpeed2) {
                    charaHP2 = charaHP2 - charaAttack1;
                    System.out.printf("%s used %s%n", charaName1, charaMove1);
                    if (charaHP2 <= 0) {
                        player1wins += 1;
                        System.out.printf("%s's HP dropped to 0%n",charaName2);
                        System.out.printf("%s wins the round%n", charaName1);
                    }else {
                        charaHP1 = charaHP1 - charaAttack2;
                        System.out.printf("%s used %s%n", charaName2, charaMove2);
                        if (charaHP1 <= 0){
                            player2wins += 1;
                            System.out.printf("%s's HP dropped to 0%n", charaName1);
                            System.out.printf("%s wins the round%n",charaName2);
                        }
                    }
                } else if (charaSpeed2 > charaSpeed1) {
                        charaHP1 = charaHP1 - charaAttack2;
                    System.out.printf("%s used %s%n", charaName2, charaMove2);
                        if (charaHP1 <= 0) {
                            player2wins += 1;
                            System.out.printf("%s's HP dropped to 0%n", charaName1);
                            System.out.printf("%s wins the round%n",charaName2);
                        }else {
                            charaHP2 = charaHP2 - charaAttack1;
                            System.out.printf("%s used %s%n", charaName1, charaMove1);
                            if (charaHP2 <= 0){
                                player1wins += 1;
                                System.out.printf("%s's HP dropped to 0%n",charaName2);
                                System.out.printf("%s wins the round%n", charaName1);
                            }
                        }
                    }
            }
        }
        System.out.println("Player 1 wins: "+player1wins);
        System.out.println("PLayer 2 wins: "+player2wins);
        if (player1wins > player2wins){
            System.out.println("Player 1 wins");
        }else if(player2wins>player1wins){
            System.out.println("Player 2 wins");
        }else{
            System.out.println("Something went wrong, check if number of rounds is odd");
        }
    }
    public static String assignName(){
        System.out.println("Enter a name: ");
        return console.nextLine();
    }
    public static String assignMove(){
        System.out.println("Enter Move name: ");
        return console.nextLine();
    }
    public static int assignAttack(){
        System.out.println("Enter Attack: ");
        return console.nextInt();
    }
    public static int assignHP(){
        System.out.println("Enter HP: ");
        return console.nextInt();
    }
    public static int assignSpeed(){
        System.out.println("Enter Speed:");
        String charaSpeed = console.nextLine();
        return Integer.parseInt(console.nextLine());
    }
}
