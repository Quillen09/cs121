package week13.linkedActivity;

import java.util.LinkedList;

public class restoUser {
    public String username;
    public String date;
    public String guestNum;
    public String tableNum;
    public String menu;
    public String orderNum;
    public LinkedList<String> tableList = new LinkedList<>();

    restoUser(String username,String date, String guestNum, String tableNum,String menu,String orderNum){
        this.date = date;
        this.guestNum = guestNum;
        this.menu = menu;
        this.username = username;
        this.tableNum = tableNum;
        this.orderNum = orderNum;
    }

    public void addReservation(String date, String guestNum, String menu, String username, String tableNum, String orderNum){
        tableList.add(username);
        tableList.add(date);
        tableList.add(guestNum);
        tableList.add(tableNum);
        tableList.add(menu);
        tableList.add(orderNum);
    }
    public void removeReservation(String date, String guestNum, String menu, String username, String tableNum, String orderNum){
        tableList.remove(username);
        tableList.remove(date);
        tableList.remove(guestNum);
        tableList.remove(tableNum);
        tableList.remove(menu);
        tableList.remove(orderNum);
    }
    public LinkedList<String> getUserInfo(LinkedList<String> tableList){
        return tableList;
    }
    public void displayBooking(){
        for (int i = 0; i < 6; i++){
            System.out.println(tableList.get(i));
        }
    }
}
