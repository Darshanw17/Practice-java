import java.util.*;

public class RouteTheBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        

        // Map to store junctions and their connected junctions
        Map<String, List<String>> junctions = new HashMap<>();

        // Read the junction connections
        for (int i = 0; i < N; i++) {
            String[] line = scanner.nextLine().split(" ");
            String junction = line[0];
            junctions.put(junction, new ArrayList<>(Arrays.asList(Arrays.copyOfRange(line, 1, line.length))));
        }

        // Read the sequence of balls
        String[] balls = scanner.nextLine().split(" ");

        // Function to find the path from source to the target junction
        int pathCount = 0;
        String currentJunction = "Source";
        for (String ball : balls) {
            String targetJunction = ball;
            pathCount += findPath(junctions, currentJunction, targetJunction);
            currentJunction = targetJunction;
        }

        System.out.println(pathCount);
    }

    private static int findPath(Map<String, List<String>> junctions, String currentJunction, String targetJunction) {
        // If the current junction is the target, no path needs to be opened
        if (currentJunction.equals(targetJunction)) {
            return 0;
        }

        // Find a connected junction that leads to the target
        for (String nextJunction : junctions.get(currentJunction)) {
            if (nextJunction.equals(targetJunction)) {
                return 1; // Open the path to the target junction
            }
        }

        // If no direct path, recursively find the path from a connected junction
        for (String nextJunction : junctions.get(currentJunction)) {
            int pathCount = findPath(junctions, nextJunction, targetJunction);
            if (pathCount > 0) {
                return pathCount + 1; // Open the path to the connected junction
            }
        }

        // No path found
        return 0;
    }
}
