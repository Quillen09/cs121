package week10.Activity19;

import java.util.ArrayList;

public class StringArrayList {
    ArrayList<String> listt = new ArrayList<>();
    //CourseInfo at the bottom

    public void addListt(String litt){
    listt.add(litt);
    }
    public void removeListt(int index){
        listt.remove(index);
    }
    public String getListt(int index){
        return listt.get(index);
    }
    public int sizeListt(){
       return listt.size();
    }
    public void displayListt(){
        for(String litt : listt){
            System.out.println(litt);
        }
    }
    public void displayListt2(){
        for(int i = 0; i < listt.size(); i++){
            System.out.println(listt.get(i));
        }
    }
    ArrayList<String> course = new ArrayList<>();
    ArrayList<Double> gpa = new ArrayList<>();
    ArrayList<Integer> grade = new ArrayList<>();
    ArrayList<Character> letter = new ArrayList<>();

    public String getCourse(int index){
        return course.get(index);
    }
    public void addCourse(String name){
        course.add(name);
    }
    public Double getGpa(int index){
        return gpa.get(index);
    }
    public void addGpa(Double gPa){
        gpa.add(gPa);
    }
    public int getGrade(int index){
        return grade.get(index);
    }
    public void addGrade(int Grade){
        grade.add(Grade);
    }
    public char getLetter(int index){
        return letter.get(index);
    }
    public void addLetter(char letterGrade){
        letter.add(letterGrade);
    }
    public void displayCourseInfo() {
        System.out.printf("%-10s %-10s %-10s %s\n", "Name", "GPA", "Grade", "Letter grade");
        for (int i = 0; i < course.size(); i++) {
            System.out.printf("%-10s %-10f %-10d %c", course.get(i), gpa.get(i), grade.get(i), letter.get(i));
        }
    }
}
