package Functions;

import java.util.Scanner;

public class recursivePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int N = input.nextInt();
        pattern(N, N, false);
    }

    static int pattern(int N, int typeN, boolean check) {
        System.out.print(N + " ");

        if (N > 0 && check == false) {
            N -= 5;
        }
        if (N <= 0 || check == true) {
            check = true;
            N += 5;

            if (N == typeN) {
                System.out.print(N);
                return 0;
            }
        }
        return pattern(N, typeN, check);
    }
}
