package Giris;

import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nick = "patika";
        String pass = "java123";

        System.out.print("Kullanıcı adınızı giriniz:");
        String nickCheck = input.nextLine();

        System.out.print("Şifre giriniz:");
        String passCheck = input.nextLine();

        if (nick.equals((nickCheck)) && pass.equals(passCheck))
            System.out.println("Hoşgeldiniz!");

        else if (!pass.equals(passCheck)){
            System.out.print("Şifrenizi değiştirmek ister misiniz?(Y/N): ");
            String selection=input.nextLine();
            if(selection.equals("Y")){
                System.out.print("Yeni şifrenizi giriniz= ");
                String newPass=input.nextLine();
                if (newPass.equals(pass))
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                else
                    System.out.println("Şifre oluşturuldu");
            }
            else if(selection.equals("N"))
                System.out.print("Şifre değiştirilmedi.");

            else
                System.out.print("Yanlış değer girdiniz. Şifre değiştirilmedi.");

        }
    }
}
