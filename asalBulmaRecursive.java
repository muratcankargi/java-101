
import java.util.Scanner;

public class asalBulmaRecursive {

    static boolean asalBul(int number, int counter) {

        if (number<=1)
            return false;
        if (number == counter)
            return true;

        if (number % counter == 0)
            return false;

        return asalBul(number, ++counter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Sayı Giriniz :");
        number = input.nextInt();

        if (asalBul(number, 2))
            System.out.println(number + " sayısı ASALDIR!");
        else
            System.out.println(number + " sayısı ASAL değildir!");
    }
}
