
import java.util.Scanner;

public class fibonacciDizisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Eleman sayısını girin : ");
        number = input.nextInt();
        int a = 0, b = 1, c;
        System.out.print(number + " Elemanlı Fibonacci Serisi :" + a + " ");
        for (int i = 1; i < number; i++) {
            c = a + b;
            b = a;
            a = c;
            System.out.print(c + " ");
        }
    }
}
