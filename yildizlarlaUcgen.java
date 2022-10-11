import java.util.Scanner;
public class yildizlarlaUcgen {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        System.out.println("Bir Sayı Giriniz :");
        n = input.nextInt();

        for (int i = 0; i < n-1; i++) {
            for (int j = (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        int x=2*n-1;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i+1; k++) {
                System.out.print(" ");
            }

            for (int j = x; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
            x-=2;

        }

    }
}
