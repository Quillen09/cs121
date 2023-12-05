package week9;

public class Restaurant {
    private int table;
    private String menu;
    private String delivery;

    private static int instanceCount = 0;

    public Restaurant(){
        instanceCount ++;
    }

    public Restaurant(int table, String menu, String delivery){
        this.table = table;
        this.menu = menu;
        this.delivery = delivery;
        instanceCount ++;
    }

    public void setTable(int table){
        this.table = table;
    }
    public void setMenu(String menu){
        this.menu = menu;
    }
    public void setDelivery(String delivery){
        this.delivery = delivery;
    }

    public int getTable(){
        return table;
    }
    public String getMenu(){
        return menu;
    }
    public String getDelivery(){
        return menu;
    }
    public static int getInstanceCount(){
        return instanceCount;
    }
}
