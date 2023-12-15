package Week3;

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Is anyone vegetarian?");
        String vegetarian = console.nextLine();
        System.out.println("Is anyone vegan?");
        String vegan = console.nextLine();
        System.out.println("Is anyone gluten free?");
        String gluten = console.nextLine();

        if (vegetarian.equals("no") && vegan.equals("no") && gluten.equals("no")){
            System.out.println("Joe’s Gourmet Burgers");
        }else if (vegan.equals("no")){
            System.out.println("Main Street Pizza Company");
        } else if (gluten.equals("no")&& vegan.equals("no")) {
            System.out.println("Mama’s Fine Italian");
        }
        System.out.printf("Corner Café%nThe Chef’s Kitchen ");
    }
}
