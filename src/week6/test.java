package week6;

public class test {
    public static void main(String[] args) {
        //Scanner console = new Scanner(System.in);
        //console.nextLine();
        //create instance of car class
        car tesla = new car("tesla", 2022, false);
        car honda = new car();
        tesla.setYears(2022);
        System.out.println(tesla.getYear());
        System.out.println(tesla.color);
    }
}
