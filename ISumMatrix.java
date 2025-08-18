import java.util.*;

public class ISumMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 1, 2, 3},
            {4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 1, 2, 3},
            {4, 5, 6, 7, 8, 9}
        };

        int[][] I = {
            {1, 1, 1},
            {0, 1, 0},
            {1, 1, 1}
        };

        ArrayList<Integer> result = new ArrayList<>();
        int count = 0; 

        for (int i = 0; i <= 6 - 3; i++) {
            for (int j = 0; j <= 6 - 3; j++) {
                int sum = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (I[x][y] == 1) {
                            sum += mat[i + x][j + y];
                        }
                    }
                }
                result.add(sum);
                count++;
            }
        }

        System.out.println("All I sums: " + result);
        System.out.println("Total number of possible I: " + count);
    }
}
