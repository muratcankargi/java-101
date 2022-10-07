import java.util.Scanner;
public class daireDilimininAlani {
    public static void main(String[] args) {
        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        Scanner input=new Scanner(System.in);

        double pi=3.14,r,alfa,dilimAlan;

        System.out.print("Dairenin yaricapini giriniz=");
        r=input.nextDouble();

        System.out.print("Dairenin merkez açısının ölçüsünü giriniz=");
        alfa=input.nextDouble();

        dilimAlan=(pi*(r*r)*alfa)/360;

        System.out.println("Dairenin alanı="+dilimAlan);
        System.out.print(r+" yaricapli tam taire alanı="+(pi*r*r));

    }
}
