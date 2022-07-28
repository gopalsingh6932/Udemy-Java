import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] newArray = new int[3][3];

        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // matrix[i][j] = matrix[j][i];
                newArray[i][j] = matrix[j][i];
                
                
            }
            
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = newArray[i][j];

            }
        }

        System.out.println();
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
