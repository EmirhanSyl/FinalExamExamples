package But30012017;

import com.blackflower.glorytoarstotzka.ConsoleColors;
/**
 *
 * @author emirs
 */


public class MatrixQ {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3, 8, 11},
            {3, 5, 8, 13, 9},
            {0, 1, 1, 2, 3},
            {1, 3, 4, 7, 10},
            {1, 1, 2, 3, 5},
        };
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > 1) {
                    int total = matrix[i][j-1] + matrix[i][j-2];
                    
                    if (total != matrix[i][j]) {
                        System.out.println(ConsoleColors.RED + "Broken! Row: " + i + " Column: " + j + " Value: " + matrix[i][j] + ConsoleColors.RESET);
                    }
                    else{
                        System.out.println("Not Broken. Row: " + i + " Column: " + j + " Value: " + matrix[i][j]);
                    }
                }
            }
        }
    }
}
