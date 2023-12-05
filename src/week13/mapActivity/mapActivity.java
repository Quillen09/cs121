package week13.mapActivity;

import java.util.HashMap;
import java.util.Map;

public class mapActivity {
    Map<Integer, Integer> squares = new HashMap<>();

    public void addSquares(int squareBase, int square) {
        squares.put(squareBase, square);
    }

    public void removeSquares(int squareBase) {
        squares.remove(squareBase);
    }

    public Object getSquares(int squareBase) {
        Object square;
        if (squares.containsKey(squareBase)) {
            square = squares.get(squareBase);
        } else {
            square = "course not found";
        }
        return square;
    }

    public void displaySquares() {
        squares.forEach( (squareBase,square) -> {
            System.out.printf("Square base: %d | Square: %d\n"
                    , squareBase, square);
        });
    }
}
