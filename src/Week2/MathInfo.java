package Week2;
import java.util.Scanner;
public class MathInfo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = console.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        StringBuilder reverseName = new StringBuilder(name);
        reverseName.reverse();

        System.out.println("Enter first integer: ");
        int numOne = Integer.parseInt(console.nextLine());
        System.out.println("Enter second integer: ");
        int numTwo = Integer.parseInt(console.nextLine());
        //addition, subtraction, multiplication, division
        int add = (numOne + numTwo);
        System.out.printf("%d + %d = %d%n", numOne, numTwo, add);
        int sub = (numOne - numTwo);
        System.out.printf("%d - %d = %d%n", numOne, numTwo, sub);
        int mult = (numOne * numTwo);
        System.out.printf("%d * %d = %d%n", numOne, numTwo, mult);
        int div = (numOne / numTwo);
        System.out.printf("%d / %d = %d%n",numOne, numTwo, div);
        //square root
        double sqrt1 = Math.sqrt(numOne);
        System.out.printf("The square root of %d is %.2f", numOne, sqrt1);
        //power
        double power = Math.pow(numOne,numTwo);
        System.out.printf("The power of %d and %d is %.2f", numOne, numTwo, power);
        //logarithm
        double log = Math.log(numOne);
        System.out.printf("The log of %d is %.2f", numOne, log);
        //Math.abs - absolute value
        //Math.max - compares two numbers take maximum
        //Math.min - compares two numbers takes minimum
    }

}
