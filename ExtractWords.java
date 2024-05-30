
public class ExtractWords {

    public static void main(String[] args) {
        String input = "My name is Shanu Shanu Kumar";

        String[] words = extractWords(input);
        System.out.println("Words extracted from the string-");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String[] extractWords(String str) {
        return str.split("\\s+");
    }
}