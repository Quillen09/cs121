package week13.linkedActivity;

public class restoMain {
    public static void main(String[] args) {
        restoUser user1 = new restoUser("user","nov","1","19","alfredo","9");
        restoUser user2 = new restoUser("user2","nov2","2","21","chicken", "3");
        user1.displayBooking();
        user2.displayBooking();
        user1.addReservation("dec","9","steak","user3","21","5");
        user2.addReservation("jan","4","pasta","user4","5","8");
        user1.displayBooking();
        user2.displayBooking();
        user1.removeReservation("nov","1","alfredo","user","19","9");
        user2.removeReservation("nov","2","chicken","user2","21","3");
        user1.displayBooking();
        user2.displayBooking();
    }
}
