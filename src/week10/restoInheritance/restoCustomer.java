package week10.restoInheritance;

public class restoCustomer extends restoUser{
    int loyalty;
    String pastReserve;
    public restoCustomer(String name, String email, int phone, String password, int loyalty, String pastReserve){
        super(name, email, phone, password);
        this.loyalty = loyalty;
        this.pastReserve = pastReserve;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public String getPastReserve() {
        return pastReserve;
    }

    public void setPastReserve(String pastReserve) {
        this.pastReserve = pastReserve;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nPhone: %d%nEmail: %s%nPassword: %s%nLoyalty Points: %d%nPast Reservations: %s%n"
                ,name,phone,email,password,loyalty,pastReserve);
    }
}
