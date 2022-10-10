import java.util.Scanner;

public class tamBolunebilmeDonguler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0, adet = 0;

        System.out.print("Sayi giriniz : ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                adet++;
                System.out.println("3 ve 4 e tam bölünen " + adet + ". sayı= " + i);
                toplam += i;
            }
        }

        System.out.println("Sayıların ortalaması : " + (toplam / adet));
    }
}
