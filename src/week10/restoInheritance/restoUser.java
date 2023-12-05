package week10.restoInheritance;

public class restoUser {
    String name;
    String email;
    int phone;
    String password;
    public restoUser(String name, String email, int phone, String password){
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nPhone: %d%nEmail: %s%nPassword: %s%n",name,phone,email,password);
    }
}
