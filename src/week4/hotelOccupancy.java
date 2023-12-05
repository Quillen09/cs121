package week4;

import java.util.Scanner;

public class hotelOccupancy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of floors");
        int floors = console.nextInt();
        int totalRooms = 0;
        int totalOccupied = 0;
        int vacantRooms = 0;
        double occupancy = 0;
        for(int i = 1; i <= floors; i++){
            System.out.printf("Enter number of rooms on floor "+ i);
            System.out.println();
            int rooms = console.nextInt();
            System.out.println("Enter number of occupied rooms");
            int occupied = console.nextInt();
            totalOccupied = occupied + totalOccupied;
            totalRooms = rooms + totalRooms;
            vacantRooms = totalRooms - totalOccupied;
            occupancy = (double) totalOccupied / totalRooms;

        }
        System.out.printf("Floors: "+floors);
        System.out.printf("\nRooms: "+totalRooms);
        System.out.printf("\nOccupied rooms: "+totalOccupied);
        System.out.printf("\nVacant rooms: "+vacantRooms);
        System.out.printf("\nOccupancy: "+occupancy);
    }
}
