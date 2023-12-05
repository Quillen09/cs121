package Week2;
import java.util.Scanner;
public class integerdiv {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstname = keyboard.nextLine();
        System.out.println(firstname);
        System.out.println("What is your age?");
        //for one integer
        int age = keyboard.nextInt();
        System.out.println(age);
        //for multiple integers
        //System.out.println("What are the ages");
        //int ages = Integer.parseInt(keyboard.nextLine());
        //System.out.println(ages);
        System.out.println("Enter gpa");
        double gpa = keyboard.nextDouble();
        System.out.println(gpa);

        int numone = 1;
        int numtwo = 4;
        //cast integer as double
        double results = (double)numone/numtwo;
        System.out.println(results);
        //does division then casts as double - results in 0.0
        double result = (double)(numone/numtwo);
        System.out.println(result);

        int one = 5;
        int two = 10;
        double res = (double)one/two;
        System.out.println(res);


    }
}
