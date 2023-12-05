package week15;

import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class simpleNote {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String DOB = JOptionPane.showInputDialog("Enter birthday in format of mm/dd/yyyy");
        String currentDate = JOptionPane.showInputDialog("Enter current date in format of mm/dd/yyyy");
        int day = 0;
        try{
            Date date1 = dateFormat.parse(DOB);
            Date date2 = dateFormat.parse(currentDate);
            String DOBFormat = date1.toString();
            String current = date2.toString();
            long difference = date2.getTime() - date1.getTime();
            day = (int)TimeUnit.DAYS.convert(difference,TimeUnit.MILLISECONDS);
            double year = day/365.25;
            JOptionPane.showMessageDialog(null,String.format("Birthday is : %s%nCurrent Date%s%nAge is %d" +
                    " in milliseconds%nAge is %d days%nAge is %.3f years",date1,date2,difference,day,year));
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
