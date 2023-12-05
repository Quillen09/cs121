package week10.abstraction;

public class employeeTest {
    public static void main(String[] args) {
        salariedEmployee employee1 = new salariedEmployee(12345,"bob",80000);
        System.out.printf("Weekly salary: %.2f%n", employee1.calculatePay());
        hourlyEmployee employee2 = new hourlyEmployee(54321, "obo", 30.00,40);
        System.out.printf("weekly salary: %.2f%n", employee2.calculatePay());
    }
}
