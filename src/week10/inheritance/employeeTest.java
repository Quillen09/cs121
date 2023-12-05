package week10.inheritance;

public class employeeTest {
    public static void main(String[] args) {
        employee employee1 = new employee(12345, "bob");
        System.out.println(employee1.getName());
        System.out.println(employee1.getId());
        System.out.println(employee1);
    }
}
