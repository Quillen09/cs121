package week10.abstraction;

public class hourlyEmployee extends employee {
    private double wage;
    private int hours;
    public hourlyEmployee(int id, String name, double wage, int hours){
        super(id, name);
        this.hours = hours;
        this.wage = wage;
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
        return super.toString()+String.format("Wage: %.2f%nHours: %d%n", getWage(),getHours());
    }

    @Override
    public double calculatePay() {
        return wage * hours;
    }
}
