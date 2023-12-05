package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileIO {
    public static void main(String[] args) throws FileNotFoundException {
        //instance of file class
        File file = new File("courses.txt");
       try {
           Scanner console = new Scanner(file);
           String header = console.nextLine();
           while (console.hasNextLine()) {
              /* String Line = console.nextLine();
               System.out.println(Line);*/
               String course = console.next();
               int credits = Integer.parseInt(console.next());
               int score = Integer.parseInt(console.next());
               System.out.printf("%-7s %3d %7d\n", course, credits, score);
           }
       }catch (FileNotFoundException e){
           //e.printStackTrace();
           System.err.println("File not found");
       }
    }
}
