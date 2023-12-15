package Week3;
import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
       Scanner console = new Scanner (System.in);
        System.out.println("Enter a number");
        int numOne = console.nextInt();
        System.out.println("Enter another number");
        int numTwo = console.nextInt();
        System.out.println("Enter a final number");
        int numThree = console.nextInt();

        if (numOne == numTwo && numOne == numThree){
            System.out.println("the triangle is equilateral");
        } else if (numOne == numTwo || numThree == numOne || numThree == numTwo) {
            System.out.println("the triangle is isosceles");
        }else{
            System.out.println("The triangle is scalene");
        }
    }
}
