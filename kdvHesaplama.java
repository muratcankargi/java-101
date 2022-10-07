package Giris;
import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double para,kdv18=0.18,kdv8=0.08;
        System.out.print("Para degerinizi giriniz:");
        para = input.nextInt();

        System.out.print(para>0 && para<=1000 ? "KDV tutarı= "+(para*kdv18):"KDV tutarı= "+(para*kdv8));
    }
}
