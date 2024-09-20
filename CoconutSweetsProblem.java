import java.util.Scanner;

public class CoconutSweetsProblem {
    
        public static int minBoxesToBuy(int N, int E, int D) {
        // Calculate the total number of sweets required
        int totalCoconutRequired = E*D;

        // Calculate the number of Sundays within the given days
        int sundays = D / 7;

        // Total days you can buy sweets (excluding Sundays)
        int availableDaysToBuy = D-sundays;

        // Total number of sweets you can buy
        int maxCoconutPurchasable = N*availableDaysToBuy;

        // If you cannot purchase enough sweets
        if (maxCoconutPurchasable < totalCoconutRequired) {
            return -1;
        }

        // Minimum number of boxes needed to buy
        int minBoxes = (totalCoconutRequired + N - 1) / N; // ceil division

        // Check if the min boxes fit within available days to buy
        if (minBoxes > availableDaysToBuy) {
            return -1;
        }

        return minBoxes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of coconut per box: ");
        int N = sc.nextInt();
        
        System.out.println("Enter number of coconut required daily: ");
        int E = sc.nextInt();
        
        System.out.println("Enter number of days to stay alive: ");
        int D = sc.nextInt();
        
        
        int result = minBoxesToBuy(N, E, D);
        //corner case
        if (result == -1) {
            System.out.println("It is not possible to survive.");
        } else {
            System.out.println("Minimum number of coconuts to buy: " + result);
        }

        sc.close();
    }
}