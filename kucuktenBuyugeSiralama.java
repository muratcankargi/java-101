package Giris;
import java.util.Scanner;
public class kucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1,num2,num3;
        int min,min2;
        System.out.print("1. sayiyi giriniz= ");
        num1=input.nextInt();

        System.out.print("2. sayiyi giriniz= ");
        num2=input.nextInt();

        System.out.print("3. sayiyi giriniz= ");
        num3=input.nextInt();

        if(num1<=num2 && num1<=num3) {
            System.out.print(num1+"<");
            if(num2<num3)
                System.out.println(num2+"<"+num3);
            else System.out.println(num3+"<"+num2);
        }
        else if (num2<=num1 && num2<=num3) {
            System.out.print(num2+"<");
            if (num1<num3)
                System.out.print(num1+"<"+num3);
            else
                System.out.println(num3+"<"+num1);
        }
        else{
            System.out.print(num3+"<");
            if (num1<num2)
                System.out.print(num1+"<"+num2);
            else
                System.out.println(num2+"<"+num1);
        }
    }
}
