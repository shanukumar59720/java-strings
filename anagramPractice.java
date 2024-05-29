import java.util.Arrays;
import java.util.Scanner;

public class anagramPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two String-");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // first step
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        // second step
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        // third step
        char ar1[] = str1.toCharArray();
        char ar2[] = str2.toCharArray();

        // fourth step
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        // fifth step
        if(Arrays.equals(ar1, ar2)){
            System.out.println("It is an anagram");
        } else {
            System.out.println("It is no an anagram");
        }


    }
}
