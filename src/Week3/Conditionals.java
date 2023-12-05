package Week3;

public class Conditionals {
    public static void main(String[] args) {
        //conditionals

        int age = 19;
        double gpa = 3.2;
        char letterGrade = 'A';
        boolean csMajor = true;
        boolean isStudent = false;
        boolean isTeacher = true;
        boolean isTeacherCsMajor = true;
        String name = "Krista";
        String favoriteColor = "Blue";

        if(age<21){
            System.out.println("You are younger than 21");
        }else{
            System.out.println("You are older than 21");
        }
        if(gpa>=4.0){
            System.out.println("You get an A");
        }else if (gpa>=3.6){
            System.out.println("You get a A-");
        } else if (gpa>=2.7) {
            System.out.println("You get a B");
        } else if (gpa>=1.7) {
            System.out.println("You get a C");
        }else{
            System.out.println("you get less than a C");}

        //relational operator
        //< > <= >= == !=

        if (csMajor == isStudent){
            System.out.println("This person is a student and a cs major");
        }else{
            if (isTeacher != isStudent){
                System.out.println("This person is a teacher and may be a student");
            }else if(isTeacher == isTeacherCsMajor){
                System.out.println("This person is a teacher and a cs major");
            }
            System.out.println("The person is either not a student not a cs major or neither");
        }

        String name2 = "bob";
        if (!name.equals(name2)){
            System.out.printf("The name %s is not equal to the name %s", name, name2);
        }else{
            System.out.println("The names are equal");
        }
    }
}
