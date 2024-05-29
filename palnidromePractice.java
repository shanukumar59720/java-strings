import java.util.Scanner;

public class palnidromePractice {
    public static void main(String[] args) {
        String str1 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string-");
        String str = sc.nextLine();
        sc.close();

        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println("After reversing the string will be - " + str1);

        if (str.equals(str1)) {
            System.out.println(str + " is a palindrome!");
        } else {
            System.out.println(str + " is not a palindrome!");
        }
    }
}
