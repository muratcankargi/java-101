import java.util.Scanner;
public class ustluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b,islem=1;
        System.out.print("Üst alma değerlerini giriniz (a^b)\na : ");
        a=input.nextInt();

        System.out.print("b : ");
        b=input.nextInt();

        for(int i =0;i<b;i++){
            islem*=a;
        }
        System.out.println(a+"^"+b+" : "+islem);
    }
}
