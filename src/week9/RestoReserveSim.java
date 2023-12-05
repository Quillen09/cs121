package week9;

public class RestoReserveSim {
    public static void main(String[] args) {
        String [][] tables = {
                {"5", "available"},
                {"3", "available"},
                {"8", "booked"}
        };
        System.out.println("Seats\tAvailability");
        for(int row = 0; row<tables.length; row++){
            for(int column = 0; column < tables[row].length;column++) {
                System.out.printf(tables[row][column]);
                System.out.print("\t\t");
            }
            System.out.println();
        }
        tables[0][1]="booked";
        tables[1][1]="booked";
        tables[2][1]="available";

        System.out.println("Seats\tAvailability : Updated");
        for(int row = 0; row<tables.length; row++) {
            for (int column = 0; column < tables[row].length; column++) {
                System.out.printf(tables[row][column]);
                System.out.print("\t\t");
            }
            System.out.println();
        }
    }
}
