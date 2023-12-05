package week5;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileAppend {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter filewriter = new FileWriter("courses.txt", true);
            PrintWriter output = new PrintWriter(filewriter);
            String course = JOptionPane.showInputDialog("Enter course name");
            String credits = JOptionPane.showInputDialog("Enter course credits");
            String score = JOptionPane.showInputDialog("Enter course score");
            output.printf("%n%s %s %s", course, credits, score);
            filewriter.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.println("File issue");
        }

    }
}
