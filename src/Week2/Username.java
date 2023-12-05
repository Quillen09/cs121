package Week2;

import javax.swing.*;

public class Username {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Enter username: ");
        JOptionPane.showMessageDialog(null, username.toLowerCase());
        JOptionPane.showMessageDialog(null, username.toUpperCase());
        StringBuilder Rname = new StringBuilder(username);
        JOptionPane.showMessageDialog(null, Rname.reverse());
    }
}
