package But27012016;

/**
 *
 * @author emirs
 */
public class MatrixQ {
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1, 1, 1},
            {3, 4, 4, 3, 3},
            {4, 4, 5, 4, 4},
            {7, 7, 7, 7, 7},
            {9, 9, 9, 9, 9},
        };
        
        for (int i = 0; i < matrix.length; i++) {
            int checkedNum = matrix[i][0];
            boolean isSame = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != checkedNum) {
                    isSame = false;
                }
            }
            
            if (isSame) {
                System.out.println(i + ". Row");
            }
        }
    }
}
