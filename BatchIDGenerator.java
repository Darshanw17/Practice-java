import java.util.Scanner;

public class BatchIDGenerator {
    public static String createBatchID(String facilityName, String month, int day, int hour, int minute) {
        String vowels = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sb.length() && sb.length() < 3; i++) {
            char ch = facilityName.charAt(i);
            if (vowels.indexOf(ch) == -1) { sb.append(Character.toUpperCase(ch));
            }
        }
        String dateTimeCode = String.format("%02d%02d%02d", day, hour, minute);
        return sb.toString() + month.toUpperCase() + dateTimeCode;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the facility name: ");
        String facilityName = scanner.nextLine();
        System.out.print("Enter the month (e.g., JUN): ");
        String month = scanner.nextLine();
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the hour (24-hour format): ");
        int hour = scanner.nextInt();
        System.out.print("Enter the minute: ");
        int minute = scanner.nextInt();
        String batchID = createBatchID(facilityName, month, day, hour, minute);
        System.out.println("Batch ID: " + batchID);

        scanner.close();
    }
}

