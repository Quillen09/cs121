package week10.Activity19;

import java.util.Scanner;

public class CourseInfo {
    public static void main(String[] args) {
       StringArrayList course = new StringArrayList();
       StringArrayList gpa = new StringArrayList();
       StringArrayList grade = new StringArrayList();
       StringArrayList letter = new StringArrayList();
        Scanner console = new Scanner(System.in);
        StringArrayList method = new StringArrayList();
        while(true) {
            System.out.println("Enter course name or q to quit");
            String name = console.nextLine();
            if (name.equals("q")) {
                break;
            }
            course.addCourse(name);
            System.out.println("Enter GPA");
            Double gPa = Double.parseDouble(console.nextLine());
            gpa.addGpa(gPa);
            System.out.println("Enter letter grade");
            char letterGrade = console.next().charAt(0);
            console.nextLine();
            letter.addLetter(letterGrade);
            System.out.println("Enter grade");
            int score = Integer.parseInt(console.nextLine());
            grade.addGrade(score);
        }
        method.displayCourseInfo();
    }
}
