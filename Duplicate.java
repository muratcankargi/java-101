import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);

        }
        System.out.println(Arrays.toString(arr));

        repeaters(arr);
    }

    static void repeaters(int[] arr) {
        int[] duplicate = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i] && i != j) {
                    if (!isFind(duplicate, arr[i]) && isEven(arr[i]))
                        duplicate[startIndex++] = arr[i];
                    break;
                }
            }
        }
        System.out.print("Dizide tekrarlanan çift sayılar : ");
        for (int a : duplicate) {
            if (a != 0)
                System.out.print(a + " ");
        }
    }

    static boolean isFind(int[] arr, int value) {
        for (int a : arr) {
            if (a == value)
                return true;
        }
        return false;
    }

    static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }
}
