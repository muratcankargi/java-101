
import java.util.Scanner;

public class minMaxBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pieces, number,max=0;
        int min=Integer.MAX_VALUE;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        pieces = input.nextInt();

        for (int i = 1; i <= pieces; i++) {
            System.out.print(i+". Sayıyı giriniz : ");
            number = input.nextInt();
            if(number>max)
                max=number;

            if(number<min)
                min=number;
        }
        System.out.print("En büyük sayı : "+max+"\nEn küçük sayı : "+min);
        System.out.println(Integer.MAX_VALUE);
    }
}
