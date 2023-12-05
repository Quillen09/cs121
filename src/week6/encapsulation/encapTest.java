package week6.encapsulation;

public class encapTest {
    public static void main(String[] args) {
        encap person1 = new encap("bob", "CS1", 90, 2);
        encap person2 = new encap("bobbo", "cs2", 22, 57);
        person1.useName();
        person1.useGrade();
        //person2.useCredit();
        //person2.useClasse();
    }
}
