import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isUnique = checkUniqueCharacters(input);

        if (isUnique) {
            System.out.println("The string contains all unique characters.");
        } else {
            System.out.println("The string does not contain all unique characters.");
        }
    }

    public static boolean checkUniqueCharacters(String str) {
        // Assuming ASCII character set, there are 256 possible characters
        boolean[] seen = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (seen[ch]) {
                return false; // If character has been seen before, return false
            }
            seen[ch] = true; // Mark the character as seen
        }

        return true; // If all characters are unique, return true
    }
}
