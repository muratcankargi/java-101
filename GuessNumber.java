import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int right = 5;
        int index = 0;
        int[] wrong = new int[right];
        int number = rnd.nextInt(101);
        boolean isWrong = false;

        System.out.println("Hoşgeldin! 0-100 arasındaki sayıyı bilmen için 5 hakkın var!");

        while (right != 0) {
            System.out.println("------------------");
            System.out.print("Tahmininiz : ");
            int guess = input.nextInt();

            if (guess == number) {
                wrong[index++]=guess;
                System.out.print("Tebrikler bildiniz!\nBulduğunuz sayı : " + number + "\nTahminleriniz : ");
                for (int value : wrong) {
                    if (value != 0)
                        System.out.print(value + " ");
                }
                break;
            } else if (guess > 100 || guess < 0) {
                if (!isWrong) {
                    System.out.println("0-100 aralığında sayı giriniz!\n" + right + " hakkın var.");
                    isWrong = true;
                } else {
                    right--;
                    System.out.println("0-100 aralığında sayı giriniz!\n" + right + " hakkın var.");

                }
            } else {
                right--;
                if (guess > number) {
                    System.out.println("Yanlış! Bilmeye çalıştığın sayı daha KÜÇÜK.");

                } else {
                    System.out.println("Yanlış! Bilmeye çalıştığın sayı daha BÜYÜK.");
                }
                System.out.println(right + " hakkın kaldı.");
                wrong[index++] = guess;
            }
            if (right == 0) {

                System.out.println("Kaybettiniz!\nBulmanız gereken sayı : " + number);
                if (!isWrong) {
                    System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
                }
            }

        }

    }
}
