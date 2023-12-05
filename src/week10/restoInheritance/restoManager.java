package week10.restoInheritance;

public class restoManager extends restoUser{
    String menu;
    String orders;
    public restoManager(String name, String email, int phone, String password, String menu, String orders){
        super(name, email, phone, password);
        this.menu = menu;
        this.orders = orders;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nPhone: %d%nEmail: %s%nPassword: %s%nMenu: %s%nOrders: %s%n"
                ,name,phone,email,password,menu,orders);
    }
}
