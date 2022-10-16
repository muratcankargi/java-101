import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz : ");
        String word = input.nextLine();
        word = word.toLowerCase();
        if (isPalindrom(word)) {
            System.out.println(word + " Palindrom bir kelimedir.");
        } else
            System.out.println(word + " Palindrom bir kelime değildir.");
    }

    static boolean isPalindrom(String word) {
        int length = word.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == word.charAt(length - i - 1)) {
                count++;
                if (count == (length / 2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
