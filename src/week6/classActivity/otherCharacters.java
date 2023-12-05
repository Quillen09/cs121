package week6.classActivity;

public class otherCharacters {
    String name, moveName;
    int damage, hitPoint;

    otherCharacters(int damage, int hitPoint){
        this.damage = damage;
        this.hitPoint = hitPoint;
    }

    public void showInfo(){
        System.out.printf("This is character damage: %d%n", damage);
        System.out.printf("This is character hitpoints: %d%n", hitPoint);
    }
}
