package Week2;

import java.util.Scanner;

public class Usermath {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numOne = console.nextInt();
        System.out.println("Enter another number:");
        int numTwo = console.nextInt();
        int add = (numOne + numTwo);
        int sub = (numOne - numTwo);
        int mult = (numOne * numTwo);
        int div = (numOne / numTwo);
        double sqrt = Math.sqrt(numOne);
        double  power = Math.pow(numOne, numTwo);
        double log = Math.log(numOne);
        System.out.printf("%d + %d = %d%n", numOne, numTwo, add);
        System.out.printf("%d - %d = %d%n",numOne, numTwo, sub);
        System.out.printf("%d * %d = %d%n", numOne,numTwo,mult);
        System.out.printf("%d / %d = %d%n", numOne, numTwo, div);
        System.out.printf("The square root of %d is %.2f%n", numOne, sqrt);
        System.out.printf("%d to the power of %d is %.2f%n", numOne, numTwo, power);
        System.out.printf("The logarithm of %d is %.2f%n", numOne, log);

    }
}
