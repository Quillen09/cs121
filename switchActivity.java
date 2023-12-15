package Week3;

import javax.swing.*;

public class switchActivity {
    public static void main(String[] args) {
        String pokemon = JOptionPane.showInputDialog(null, "Enter a pokemon");
        String pkmnInfo = "";
        switch(pokemon){
            case "charmander":
                pkmnInfo = "a fire type starter, its final evolution is chariszard";
                break;
            case "squirtle":
                pkmnInfo = "a water type starter, its final evolution is blastoise";
                break;
            case "bulbasaur":
                pkmnInfo = "a grass type starter, its final evolution is venosaur";
            case "pikachu":
                pkmnInfo = "an electric type, only available as a starter is special cases, its final evolution is raichu";
                break;
            default:
                pkmnInfo = "not registered or does not exist";
                break;
        }
        JOptionPane.showMessageDialog(null, "This pokemon is "+pkmnInfo);
    }
}
