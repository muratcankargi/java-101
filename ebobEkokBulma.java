
import java.util.Scanner;

public class ebobEkokBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, ebob = 1, ekok = 1;
        System.out.print("1. sayı : ");
        num1 = input.nextInt();

        System.out.print("2. sayı : ");
        num2 = input.nextInt();
/*
            //1. yol
        for (int i = 1; (i<=num1 && i<=num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("EBOB(" + num1 + "," + num2 + ") : " + ebob);
        System.out.println("EKOK(" + num1 + "," + num2 + ") : " + ((num1*num2)/ebob));*/

        //2. yol
        int j = 1;
        while ((j <= num1 && j <= num2)) {
            if (num1 % j == 0 && num2 % j == 0) {
                ebob = j;
            }
            j++;
        }
        System.out.println("EBOB(" + num1 + "," + num2 + ") : " + ebob);
        System.out.println("EKOK(" + num1 + "," + num2 + ") : " + ((num1 * num2) / ebob));

    }
}
