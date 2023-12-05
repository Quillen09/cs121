package week6.overloaded;

public class overlOad {
    String course, classe;
    int grade, gpa;

    public overlOad(){
    }
    public overlOad(String course){
        this.course = course;
    }
    public overlOad(String classe, int grade, int gpa){
        this.classe = classe;
        this.grade = grade;
        this.gpa = gpa;
    }
    public String getClasse(){
        return classe;
    }
    public String getCourse(){
        return course;
    }
    public int getGrade(){
        return grade;
    }
    public int getGpa(){
        return gpa;
    }
}
