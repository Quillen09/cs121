package week11;

public class recursion {
    public static void main(String[] args) {
        //factorial
        //1 base case
        //2 recursive call + modification
        int num = 7;
        System.out.println("factorial of 7 is " + factorial(num));

    }
    public static int factorial(int num){
        //base case
        if (num == 0){
            return 1;
        }else {
            //recursive call + modification
            return num * factorial(num - 1);
        }
    }
}
