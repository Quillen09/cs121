package week11.bigOActivity;

import java.util.ArrayList;

public class bigO {
    public String printOnce(String oneTime) {
        System.out.println(oneTime);
        return oneTime;
    }

    String oneTime;
    public String [] array = {"1 time", "2 times","3 times","4 times"};
    public String [][] arrayX2 = {{"1 - outer loop once","2","3","4"},{"5 - outer loop twice","6","7","8"}};
    public void printNTimes(){
        for (int i = 0; i < 4; i++){
            System.out.println(array[i]);
        }
    }
    public void printNX2Times(){
        for (int i = 0; i < arrayX2.length; i++){
            for (int j = 0; j <arrayX2[i].length; j++){
                System.out.println(arrayX2[i][j]);
            }
        }
    }
}
