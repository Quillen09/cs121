package week11.recursionActivity;

public class recursion {
    //int num = 10;
    public int countDown(int num){
        if (num == 0){
            System.out.println("Blast off");
            return 0;
        }else{
            System.out.println(num);
            return countDown(num - 1);
        }
    }
   // char alpha = 'z';
    public char alphaBackwards(char alpha){
        if (alpha == 'a'){
            return 'a';
        }else{
            System.out.println(alpha);
            return alphaBackwards((char) (alpha -1));
            }
        }
    }
