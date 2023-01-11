package Final25052016;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author emirs
 */
public class MatrixQ {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {4, 3, 7, 8, 9},
            {11, 10, 6, 5, 3},
            {1, 2, 3, 4, 5},
            {6, 7, 4, 3, 10},
        };
        
        int lastNum = matrix[0][0];
        boolean increasing = true;
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[i].length; j++) {
                if (increasing && matrix[i][j] < lastNum) {
                    increasing = false;
                    System.out.println(i + ". Row & " + j + ". Column. Decreasing now");
                }
                else if(matrix[i][j] > lastNum && !increasing){
                    increasing = true;
                    System.out.println(i + ". Row & " + j + ". Column. Increasing now");
                }
                else{
                    System.out.println("Stabil");
                }
                
                lastNum = matrix[i][j];
            }
        }
    }
}
