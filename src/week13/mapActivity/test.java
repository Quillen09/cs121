package week13.mapActivity;

public class test {
    public static void main(String[] args) {
        mapActivity map = new mapActivity();
        map.addSquares(2,4);
        map.addSquares(3,9);
        map.addSquares(4,16);
        map.addSquares(5,25);
        map.displaySquares();
        System.out.println();
        map.removeSquares(3);
        map.displaySquares();
    }
}
