package Week2;
import java.util.Scanner;
public class WordGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter an age: ");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println("Enter a city: ");
        String city = keyboard.nextLine();
        System.out.println("Enter a college: ");
        String college = keyboard.nextLine();
        System.out.println("Enter a major: ");
        String major = keyboard.nextLine();
        System.out.println("Enter an animal: ");
        String animal = keyboard.nextLine();
        System.out.println("Enter an animal name: ");
        String animalName = keyboard.nextLine();
        System.out.printf("There once was a person named %s who lived in %s. At the age of %d, " +
                "%s went to college at %s. %s graduated with a %s major. %nThen, %s adopted a(n) %s " +
                "named %s.", name , city, age, name, college, name, major, name, animal, animalName);
    }
}
