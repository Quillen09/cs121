package week5;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("cooouuress.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course, credits, score;
        output.printf("%s %s %s\n","Courses","credits", "score");
        for(int i = 1; i <= 3;i++ ){
            course = JOptionPane.showInputDialog(String.format("Enter course name %d", i));
            credits = JOptionPane.showInputDialog("Enter course credits");
            score = JOptionPane.showInputDialog("Enter course score");
            output.printf("%s %s %s\n", course, credits, score);
        }
        output.close();
    }
}
