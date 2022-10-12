import java.util.Scanner;

public class fibRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı : ");
        int number = input.nextInt();
        int c=0;
        if (number > 0)
            System.out.print("Fibonacci serisinin "+number+". elemanı : "+fibonacci(0, 1, c, number ));
        else System.out.println("Yanlış değer girdiniz.");
    }
    public static int fibonacci(int a, int b, int c, int number) {
        c = a + b;
        b = a;
        a = c;
        number--;
        if (number == 0)
            return c;
        return fibonacci(a, b, c, number);
    }
}
