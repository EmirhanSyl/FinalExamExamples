package Final12012017;

/**
 *
 * @author emirs
 */
public class MatrixQ {
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {0, 0, 6, 6},
            {0, 2, 1, 3},
            {5, 3, 1, 1},
            {1, 0, 1, 1},
        };
        
        int biggestNum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int newNum = 0;
            int multiplier = 1000;
            for (int j = 0; j < matrix[i].length; j++) {
//                newNum += matrix[i][j];
//                newNum *= 10;
                newNum += matrix[i][j] * multiplier;
                multiplier /= 10;
            }
            
            if (biggestNum < newNum) {
                biggestNum = newNum;
            }
        }
        System.out.println(biggestNum);
    }
}
