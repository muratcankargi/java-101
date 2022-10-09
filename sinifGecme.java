package Giris;

import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */
        Scanner input = new Scanner(System.in);
        int mat, fzk, trc, kmy, mzk;
        double total=0,totalClass=5,avarage;

        System.out.print("Matematik notu= ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) total+=mat;
        else totalClass--;

        System.out.print("Fizik notu= ");
        fzk = input.nextInt();
        if (fzk >= 0 && fzk <= 100) total+=fzk;
        else totalClass--;

        System.out.print("Türkçe notu= ");
        trc = input.nextInt();
        if (trc >= 0 && trc <= 100) total+=trc;
        else totalClass--;

        System.out.print("Kimya notu= ");
        kmy = input.nextInt();
        if (kmy >= 0 && kmy <= 100) total+=kmy;
        else totalClass--;

        System.out.print("Müzik notu= ");
        mzk = input.nextInt();
        if (mzk >= 0 && mzk <= 100) total+=mzk;
        else totalClass--;

        avarage=total/totalClass;
        if (avarage>=55) System.out.println("Sınıfı Geçtiniz!");
        else System.out.println("Sınıfta Kaldınız!");
        System.out.println("Ortalanız: "+avarage);

    }
}
