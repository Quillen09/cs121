package week10.abstraction;

public class salariedEmployee extends employee{
    private double salary;
    public salariedEmployee(int id, String name, double salary){
        super(id,name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nID: %d%nSalary: %.2f%n",getName(),getId(),getSalary());
    }
    @Override
    public double calculatePay(){
        return salary/52;
    }
}
