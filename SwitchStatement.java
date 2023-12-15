package Week3;

import javax.swing.*;

public class SwitchStatement {
    public static void main(String[] args) {
        String planet = JOptionPane.showInputDialog(null, "Enter a planet");
        String planetInfo = "";
        switch(planet){
            case "earth":
                planetInfo = "Where we live";
                break;
            case "mars":
                planetInfo = "the red planet";
                break;
            case "venus":
                planetInfo = "the hot planet";
                break;
            default:
                planetInfo = "You entered invalid response";
                break;
        }
        JOptionPane.showMessageDialog(null, planetInfo);

        String planetExpress = JOptionPane.showInputDialog(null, "enter planet");
        String planetInfoExpress = switch (planetExpress){
            case "earth" -> "this is the green planet";
            case "mars" -> "this is the red planet";
            case "venus" -> "this is the hot planet";
            default -> "invalid planet";
        };
        JOptionPane.showMessageDialog(null, planetInfoExpress);
    }
}
