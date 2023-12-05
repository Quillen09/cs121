package week4;

public class nestedForLoop {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println(i+"\n");
            for(int j = 0; j < 3; j++){
                System.out.println("     "+j);
            }
        }
        int [][] matrix = {
                {11,22,33},
                {45,54,65},
                {67,76,97}
        };
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]+" ");
            }
        }
        int n = 7;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
