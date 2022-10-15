package Arrays;
import java.util.*;
public class ArrayOrder {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n= input.nextInt();

        int[] arr=new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int i=0;i<n;i++){
            System.out.print((i+1)+". Elemanı : ");
            arr[i]=input.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Sıralama : ");
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
