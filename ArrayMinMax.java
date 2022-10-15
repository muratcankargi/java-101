package Arrays;

import java.util.*;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));

        System.out.print("Girilen sayı : ");
        int value = input.nextInt();

        Arrays.sort(arr); //diziyi küçükten büyüğe sıraladım

        for (int i = (arr.length - 1); i >= 0; i--) {
            if (arr[i] < value) {
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + arr[i]);
                break;
            }
        }

        for (int a : arr) {
            if (a > value) {
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + a);
                break;
            }

        }


    }

}
