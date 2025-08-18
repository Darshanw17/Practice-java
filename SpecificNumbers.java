public class SpecificNumbers {

    public static int CountSpecificNumbers(int m, int n) {
        // If m > n, return -1 as per the problem statement
        if (m > n) {
            return -1;
        }

        int count = 0;

        // Loop over the range from m to n
        for (int i = m; i <= n; i++) {
            // Convert the number to a string to check each digit
            String numStr = Integer.toString(i);
            boolean isValid = true;

            // Check if all digits are in {1, 4, 9}
            for (int j = 0; j < numStr.length(); j++) {
                char c = numStr.charAt(j);
                if (c != '1' && c != '4' && c != '9') {
                    isValid = false;
                    break;
                }
            }

            // If the number is valid, increment the count
            if (isValid) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        // Example usage
        int m = 1, n = 100;
        System.out.println("Count of valid numbers: " + CountSpecificNumbers(m, n));
    }
}

