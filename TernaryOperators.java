package Week3;

public class TernaryOperators {
    public static void main(String[] args) {
        boolean isSunny, isWarm;
        isSunny = true;
        isWarm = false;
        if (isSunny && isWarm) {
            System.out.println("get ice cream");
        }
        if (isSunny || isWarm){
            System.out.println("this is or statement");
        }

        //condition ? expression1 : expression2
        int num = 10;
        String result = (num %2 == 0) ? "even" : "odd";
        System.out.println("the number is :"+result);
    }
}