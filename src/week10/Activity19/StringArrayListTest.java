package week10.Activity19;

public class StringArrayListTest {
    public static void main(String[] args) {
        StringArrayList Listt = new StringArrayList();
        Listt.addListt("test");
        Listt.addListt("TestAgain");
        Listt.addListt("TestAgainAgain");
        Listt.removeListt(0);
        System.out.println(Listt.getListt(0));
        System.out.println(Listt.sizeListt());
        Listt.displayListt();
        Listt.displayListt2();
    }
}
