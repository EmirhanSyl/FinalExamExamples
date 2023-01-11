package But14062016;

/**
 *
 * @author emirs
 */
public class MatrixQ {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4, 5},
            {4, 3, 5, 3, 4},
            {3, 3, 2, 5, 3},
            {1, 2, 3, 4, 5},
            {1, 1, 1, 3, 1}};

        int mostNum = 0;
        int most = 0;
        for (int x = 1; x < 6; x++) {
            int numberCount = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == x) {
                        numberCount++;
                    }
                }
            }
            if (mostNum < numberCount) {
                mostNum = numberCount;
                most = x;
            }
            System.out.println(x + ": "+ numberCount);
        }
        System.out.println("Most num: " + most);
    }
}
