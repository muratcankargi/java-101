import java.util.Scanner;
public class vucutKitleIndexiHesaplama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Kilo (kg) / Boy(m) * Boy(m)

        System.out.print("Kilonuzu Giriniz (kg) = ");
        double kilo= input.nextDouble();

        System.out.print("Boyunuzu Giriniz (m) = ");
        double boy= input.nextDouble();

        double vucutKitleIndex=kilo/(boy*boy);
        System.out.print("Vücut Kitle İndexiniz="+vucutKitleIndex);
    }
}