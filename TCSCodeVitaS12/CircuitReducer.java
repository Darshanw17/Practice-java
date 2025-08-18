import java.util.*;

public class CircuitReducer {
    
    // Utility class to represent a point in the matrix
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // Read the number of rows/columns
        sc.nextLine(); // Consume the newline
        
        char[][] matrix = new char[N][N];
        for (int i = 0; i < N; i++) {
            matrix[i] = sc.nextLine().toCharArray();
        }

        // Start DFS or BFS to calculate resistance from opening to closing
        System.out.println(calculateResistance(matrix, N));
    }

    public static double calculateResistance(char[][] matrix, int N) {
        // Find the opening (.) and closing (.) positions
        Point opening = null, closing = null;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == '.') {
                    if (opening == null) opening = new Point(i, j); // First . is opening
                    else closing = new Point(i, j); // Second . is closing
                }
            }
        }

        // Initialize visited array to keep track of visited positions
        boolean[][] visited = new boolean[N][N];
        double totalResistance = dfs(matrix, opening.x, opening.y, closing, visited, N);
        
        return totalResistance;
    }

    // Depth First Search (DFS) to explore the grid and calculate the resistance
    public static double dfs(char[][] matrix, int x, int y, Point closing, boolean[][] visited, int N) {
        if (x < 0 || x >= N || y < 0 || y >= N || visited[x][y]) return 0;
        
        visited[x][y] = true;

        // If we reach the closing position, return 0 (no resistance to go further)
        if (x == closing.x && y == closing.y) {
            return 0;
        }

        double resistance = 0;

        // Explore the neighboring cells
        if (matrix[x][y] == '|') {
            // Vertical resistor: Can only go up or down
            if (x + 1 < N && matrix[x + 1][y] != '+') {
                resistance += 1 + dfs(matrix, x + 1, y, closing, visited, N);
            }
            if (x - 1 >= 0 && matrix[x - 1][y] != '+') {
                resistance += 1 + dfs(matrix, x - 1, y, closing, visited, N);
            }
        } else if (matrix[x][y] == '-') {
            // Horizontal resistor: Can only go left or right
            if (y + 1 < N && matrix[x][y + 1] != '+') {
                resistance += 1 + dfs(matrix, x, y + 1, closing, visited, N);
            }
            if (y - 1 >= 0 && matrix[x][y - 1] != '+') {
                resistance += 1 + dfs(matrix, x, y - 1, closing, visited, N);
            }
        }

        return resistance;
    }
}

