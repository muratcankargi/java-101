import java.util.Scanner;
public class UcgenAlaniHesaplama {
    public static void main(String[] args) {
        /*
        ΓΓ§πππππ Γ§ππ£πππ π = 2π’
        π’ = (a+b+c) / 2
        Alan * Alan = π’ * (π’ β π)* (π’ β π) * (π’ β π)
         */
        Scanner input=new Scanner(System.in);
      
        int a,b,c;
        double u,alan;
      
        System.out.print("1. kenari giriniz= ");
        a=input.nextInt();

        System.out.print("2. kenari giriniz= ");
        b=input.nextInt();

        System.out.print("3. kenari giriniz= ");
        c=input.nextInt();

        u=(a+b+c)/2;

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("ΓΓ§genin AlanΔ±= "+alan);
    }
}
