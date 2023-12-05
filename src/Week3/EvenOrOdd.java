package Week3;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = console.nextInt();
        if (input %2 == 0){
            System.out.println("The number is even");
        } else if (input %2 != 0){
            System.out.println("The number is odd");
        }
    }
}
