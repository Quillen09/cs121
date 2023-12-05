package week9;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int [][] nums = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String [][] names = {
                {"helen", "rob", "kelly"},
                {"robin", "milton", "jared"},
                {"elias", "kathy", "rami"}
        };
        System.out.println(names[1][2]);
        names[1][2]= "tom";
        System.out.println(names[1][2]);
    }
}
