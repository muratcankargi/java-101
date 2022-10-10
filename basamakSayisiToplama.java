package Giris;

import java.util.Scanner;

public class basamakSayisiToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rakam, sayi, toplam = 0, sayiYedek, basamakSayisi = 0;
        System.out.print("Sayi : ");
        sayi = input.nextInt();
        sayiYedek = sayi;

        while (sayi != 0) {
            sayi = sayi / 10;
            basamakSayisi++;
        }

        sayi = sayiYedek;

        for (int i = 0; i < basamakSayisi; i++) {
            rakam = sayi % 10;
            sayi = sayi / 10;
            toplam += rakam;
        }
        System.out.println(sayiYedek + " sayısının rakamları toplamı : " + toplam);
    }
}
