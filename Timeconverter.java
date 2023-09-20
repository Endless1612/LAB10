package Medthod2;

public class Timeconverter {
    public static void main(String[] args) {
        long milliseconds = 1000000000; // Example: 1,000,000,000 milliseconds
        String formattedTime = convertMillis(milliseconds);
        System.out.println(formattedTime); // Output: "277:46:40"
    }

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000; // Convert milliseconds to seconds
        long hours = totalSeconds / 3600;
        long remainingSeconds = totalSeconds % 3600;
        long minutes = remainingSeconds / 60;
        long seconds = remainingSeconds % 60;

        // Format the time as "hours:minutes:seconds"
        String formattedTime = hours + ":" + minutes + ":" + seconds;

        return formattedTime;
    }
}
