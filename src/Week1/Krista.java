package Week1;

public class Krista {
    public static void main(String[] args) {
        //always always semi colon (;) at end of line
        int age;
        //just a regular integer
        double gpa;
        //double is more precise than a float, and takes up more space - otherwise interchangeable
        char letterGrade;
        // SINGLe quotes
        boolean csMajor;
        //can only be true or false
        String name;
        //DOUBLE quotes

        age = 19;
        //%d
        name = "Krista";
        //%s
        letterGrade = 'A';
        csMajor = true;
        String favoriteColor = "Blue";
        gpa = 3.2;
        //%.2f

        System.out.printf("My age is %d \n", age);
        System.out.printf("My name is %s \n", name);
        System.out.print("My letter grade is ");
        System.out.println(letterGrade);
        System.out.print("My GPA is ");
        System.out.println(gpa);
        System.out.printf("My favorite color is %s", favoriteColor);
        System.out.print("Am I a CS Major? \t");
        System.out.println(csMajor);


    }
}
