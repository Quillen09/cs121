package week15.activity33;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class calMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int calories = console.nextInt();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String dietStart = console.nextLine();
        String dietEnd = console.nextLine();
    }
}
