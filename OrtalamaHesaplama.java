import java.util.Scanner;
public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int mat,fzk,kmy,trc,trh,mzk;
        System.out.print("Matematik notunuzu giriniz:");
        mat= input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fzk= input.nextInt();

        System.out.print("Kimya  notunuzu giriniz:");
        kmy= input.nextInt();

        System.out.print("Türkçe  notunuzu giriniz:");
        trc= input.nextInt();

        System.out.print("Tarih  notunuzu giriniz:");
        trh= input.nextInt();

        System.out.print("Müzik  notunuzu giriniz:");
        mzk= input.nextInt();

        double ortalama=(mat+fzk+kmy+trc+trh+mzk)/6;

        System.out.println("Ortlamanız:"+ortalama);

        System.out.println(ortalama>=60 ? "Geçtiniz!":"Kaldınız!");
    }
}