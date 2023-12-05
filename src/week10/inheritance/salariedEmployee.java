package week10.inheritance;

public class salariedEmployee extends employee{
    private double salary;
    public salariedEmployee(int id, String name, double salary){
        super(id, name);
        this.salary = salary;
    }
    public Double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nID: %d%nSalary: %.2f%n", getName(), getId(), getSalary());
    }
}
