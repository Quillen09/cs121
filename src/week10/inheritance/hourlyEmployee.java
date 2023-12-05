package week10.inheritance;

public class hourlyEmployee extends employee{
    private double wage;
    private int hours;
    public hourlyEmployee(int id, String name, double wage, int hours){
        super(id, name);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nID: %d%nWage: %.2f%nHours: %d%n", getName(), getId(),getWage(), getHours());
    }
}
