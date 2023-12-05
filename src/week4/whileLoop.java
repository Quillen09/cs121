package week4;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // while(condition){//code}
        int num = 0;
        while (num <= 5) {
            System.out.println("Number is : " + num);
            num++;
        }
        do {
        num++;
        System.out.println("Number is : " + num);
        } while (num <= 5);


        String course;
        System.out.println("enter a course");
        System.out.println();
        while(true){
            System.out.println("enter course");
            course = console.nextLine();
            if(course.equals("q")){
                break;
            }else
                System.out.println(course);
        }
    }
}
