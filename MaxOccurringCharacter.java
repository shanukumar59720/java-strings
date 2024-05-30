import java.util.Scanner;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char maxOccurringChar = findMaxOccurringCharacter(input);

        System.out.println("Maximum occurring character: " + maxOccurringChar);
    }

    public static char findMaxOccurringCharacter(String str) {
        int[] charFrequency = new int[256]; // Assuming ASCII character set

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charFrequency[ch]++;
        }

        // Find the character with maximum frequency
        char maxChar = '\0'; // Initialize with null character
        int maxFrequency = 0;
        for (int i = 0; i < charFrequency.length; i++) {
            if (charFrequency[i] > maxFrequency) {
                maxChar = (char) i;
                maxFrequency = charFrequency[i];
            }
        }

        return maxChar;
    }
}
