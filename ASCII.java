import java.util.Scanner;

public class ASCII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the good string and the student's name
        String goodString = scanner.nextLine().trim();
        String name = scanner.nextLine().trim();

        // Calculate the total distance
        int totalDistance = calculateTotalDistance(goodString, name);

        // Print the result
        System.out.println(totalDistance);
    }

    public static int calculateTotalDistance(String goodString, String name) {
        int totalDistance = 0;
        int previousGood = goodString.charAt(0);  // Initialize with the first good letter

        for (char letter : name.toCharArray()) {
            if (goodString.indexOf(letter) != -1) {
                continue;  // No need to change if letter is already a good letter
            }

            // Find the nearest good letter
            int minDistance = Integer.MAX_VALUE;
            int nearestGood = goodString.charAt(0);

            for (char goodLetter : goodString.toCharArray()) {
                int distance = Math.abs(letter - goodLetter);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestGood = goodLetter;
                } else if (distance == minDistance) {
                    if (Math.abs(previousGood - goodLetter) < Math.abs(previousGood - nearestGood)) {
                        nearestGood = goodLetter;
                    }
                }
            }

            totalDistance += minDistance;
            previousGood = nearestGood;  // Update the previous good letter
        }

        return totalDistance;
    }
}
