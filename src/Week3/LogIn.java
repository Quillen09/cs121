package Week3;

import javax.swing.*;

public class LogIn {
    public static void main(String[] args) {
       String realuser = "USER";
       String realpass = "PASS";
        String user = JOptionPane.showInputDialog(null, "Enter a username");
       String pass = JOptionPane.showInputDialog(null, "Enter a password");
       if (realuser.equals(user) && realpass.equals(pass)){
           JOptionPane.showMessageDialog(null,"welcome");
       } else if (!realuser.equals(user) && realpass.equals(pass)) {
           JOptionPane.showMessageDialog(null,"incorrect username");
       } else if (realuser.equals(user) && !realpass.equals(pass)) {
           JOptionPane.showMessageDialog(null,"incorrect password");
       }else{
           JOptionPane.showMessageDialog(null,"incorrect username and password");
       }

    }
}
