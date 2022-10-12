import java.util.*;

public class gelismisHesapMakinesi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        do {
            System.out.print("1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                    "0- Çıkış Yap\n" +
                    "Seçiniz : ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    exp();//exponential
                    break;
                case 6:
                    fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz.");
            }
        } while (select != 0);

    }

    static void plus() {
        Scanner input = new Scanner(System.in);
        int number, total = 0;
        do {
            System.out.print("Sayı giriniz : ");
            number = input.nextInt();
            total += number;
        } while (number != 0);
        System.out.println("Sonuç : " + total);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        int number, total = 0;
        do {
            System.out.print("Sayı giriniz : ");
            number = input.nextInt();
            if (total != 0)
                total -= number;
            else
                total = number;


        } while (number != 0);
        System.out.println("Sonuç : " + total);
    }

    static void multiplication() {
        Scanner input = new Scanner(System.in);
        int number, total = 1;
        do {
            System.out.print("Sayı giriniz : ");
            number = input.nextInt();

            total *= number;

        } while (number != 1);
        System.out.println("Sonuç : " + total);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        double total = 1;
        do {

            for (int i = 1; number != 1; i++) {
                System.out.print(i + ". Sayı : ");
                number = input.nextInt();
                if (i != 1 && number == 0) {
                    System.out.println("sayı 0'a bölünemez!");
                    total = 1;
                    break;
                } else if (i == 1 && number == 0)
                    total = 0;
                else if (i == 1 && number != 0)
                    total = number;
                else
                    total /= number;
            }
        } while (number != 1);
        System.out.println("Sonuç : " + total);

    }

    static void exp() {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Üstü alınacak sayı : ");
        a = input.nextInt();

        System.out.print("Üst sayı : ");
        b = input.nextInt();
        System.out.println("Sonuç : " + Math.pow(a, b));
    }

    static void fact() {
        Scanner input = new Scanner(System.in);
        int number, total = 1;
        System.out.print("Faktoriyeli alınacak sayı : ");
        number = input.nextInt();
        for (int i = 1; i <= number && number > 0; i++) {
            total *= i;
        }

        System.out.println("Sonuç : " + number + "! = " + total);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        int number, mod;
        System.out.print("Modu alınacak sayı : ");
        number = input.nextInt();

        System.out.print("Mod : ");
        mod = input.nextInt();

        System.out.println("Sonuç : " + number + " % " + mod + " = " + (number % mod));
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Dikdörtgenin kısa kenarı : ");
        a = input.nextInt();

        System.out.print("Dikdörtgenin uzun kenarı : ");
        b = input.nextInt();

        System.out.println("Çevresi : " + (2 * (a + b)));
        System.out.println("Alanı : " + a * b);

    }

}
