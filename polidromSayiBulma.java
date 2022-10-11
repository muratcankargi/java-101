import java.util.Scanner;

public class polidromSayiBulma {

    static void isPolidrom(int number) { //1221
        int digit = 0, newNumber = 0, a;
        int numberRep = number;
        while (number != 0) {
            number /= 10;
            digit++;
        }
        number = numberRep;
        for (int i = (digit - 1); i >= 0; i--) {
            a = number % 10;
            newNumber += a * Math.pow(10, i);
            number /= 10;
        }
        System.out.println(newNumber);
        if (newNumber == numberRep)
            System.out.println(newNumber + " Polidrom sayıdır");
        else
            System.out.println(numberRep + " Polidrom sayı değildir");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, numberRep, digit = 0;

        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        isPolidrom(number);


    }
}
