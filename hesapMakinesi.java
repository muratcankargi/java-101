package Giris;
import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        int select;
        System.out.print("1. sayi= ");
        num1 = input.nextDouble();
        System.out.print("2. sayi= ");
        num2 = input.nextDouble();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n\nSeçiniz= ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println(num1 + " * " + num2 + " = " + (num1 / num2));
                    break;
                }
                else{
                    System.out.println("Bir sayi 0'a bölünemez!");
                    break;
                }
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar Deneyiniz.");
        }
    }
}
