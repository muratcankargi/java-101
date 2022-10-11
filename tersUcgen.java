
import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı : ");
        int digit = input.nextInt();
        int x = digit;
        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = (2 * x - 1); k >= 1; k--) {
                System.out.print("*");
            }
            x--;
            System.out.println("");
        }
    }
}
