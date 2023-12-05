package week5;

import java.util.Scanner;

public class methods {
    static Scanner console = new Scanner(System.in);
    public static double getLength(){
        System.out.println("Enter length: ");
        double length = console.nextInt();
        return length;
    }
    public static double getWidth(){
        System.out.println("Enter width: ");
       double width = console.nextInt();
        return width;
    }
    public static double getArea(double width, double length){
       double area = length * width;
        return area;
    }
    public static void displayData(double width, double length, double area){
        System.out.println("The length is: "+length);
        System.out.println("The width is: "+width);
        System.out.println("The area is: "+area);
    }
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length, width, area);
        console.close();
    }
}
