import java.util.Scanner;
public class UcgenAlaniHesaplama {
    public static void main(String[] args) {
        /*
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
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

        System.out.println("Üçgenin Alanı= "+alan);
    }
}
