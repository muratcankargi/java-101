import java.util.Scanner;
public class ustAlma {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sinir,sayi;
        System.out.print("Sınır sayısını giriniz : ");
        sinir=input.nextInt();

        for(int i=1;i<=sinir;i*=5){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i=1;i<=sinir;i*=4){
            System.out.print (i+" ");
        }
    }
}
