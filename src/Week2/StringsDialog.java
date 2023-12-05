package Week2;

import javax.swing.*;

public class StringsDialog {
    public static void main(String[] args) {
        //JOptionPane
        String fname = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"You entered: " + fname);

        //Strings
        String name = "Robin";
        //.concat()
        name = name.concat("Tilford");
        System.out.println(name);

        //integer
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age: "));
        JOptionPane.showMessageDialog(null,"You entered: " + age);

        //double
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your gpa"));
        JOptionPane.showMessageDialog(null,"You entered:" + gpa);


        //.length
        System.out.println(name.length());
        //.charAt()
        System.out.println(name.charAt(4));
        //.replace()
        System.out.println(name.replace("RobinTilford","Jacob"));
        //.substring()
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(0,4));

    }
}
