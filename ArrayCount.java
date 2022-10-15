import java.util.Arrays;

public class ArrayCount {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] control = new int[arr.length];
        System.out.println(Arrays.toString(arr));
        int count = 1;
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count++;
                }
            }
            if (!isFind(arr[i], control)) {
                System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
                control[startIndex++] = arr[i];
            }
            count = 1;
        }
    }

    static boolean isFind(int value, int[] control) {
        for (int i = 0; i < control.length; i++) {
            if (control[i] == value) {
                return true;
            }
        }
        return false;
    }
}
