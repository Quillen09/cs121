package week6.encapsulation;

public class encap {
    public String name;
    public String classe;
    private int grade;
    private int credit;

    public encap(String name, String classe, int grade, int credit){
        this.name = name;
        this.classe = classe;
        this.grade = grade;
        this.credit = credit;
    }
    public void useName(){
        System.out.println(name);
    }
    private void useClasse(){
        System.out.println(classe);
    }
    public void useGrade(){
        System.out.println(grade);
    }
    private void useCredit(){
        System.out.println(credit);
    }
}
