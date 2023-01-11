package Final31062018;

/**
 *
 * @author emirs
 */
public class MatrixQ {
    
    public static void main(String[] args) {
        int[][] array = {
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 2},
            {1, 1, 1, 6, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1}};
    
        for (int i = 0; i < array.length; i++) {
            int total = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (j > i) {
                    if (array[i][j] != 0) {
                        System.out.println(i + " Row, " + j + " Column, Value: " + array[i][j] );
                    }
                }
                
                if (i != j) {
                    total += array[i][j];
                }
            }
            System.out.println(total);
        }
    }
}
