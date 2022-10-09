
import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
         */
        Scanner input = new Scanner(System.in);
        int ay, gun;
        System.out.print("Dogdugunuz ay(1,12)= ");
        ay = input.nextInt();

        System.out.print("Dogdugunuz gun(1,31)= ");
        gun = input.nextInt();
        if (ay >= 1 && ay <= 12 && gun >= 1 && gun <= 31) {

            if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20))
                System.out.println("Koç burcusunuz");

            else if ((ay == 4 && gun >= 20) || (ay == 5 && gun <= 21))
                System.out.println("Boğa burcusunuz");

            else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22))
                System.out.println("İkizler burcusunuz");

            else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22))
                System.out.println("Yengeç burcusunuz");

            else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22))
                System.out.println("Aslan burcusunuz");

            else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22))
                System.out.println("Başak burcusunuz");

            else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22))
                System.out.println("Terazi burcusunuz");

            else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21))
                System.out.println("Akrep burcusunuz");

            else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21))
                System.out.println("Yay burcusunuz");

            else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21))
                System.out.println("Oğlak burcusunuz");

            else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19))
                System.out.println("Kova burcusunuz");


            else System.out.println("Balık burcusunuz");

        }
        else System.out.println("Yanlis deger girdiniz");

    }
}
