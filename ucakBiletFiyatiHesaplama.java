import java.util.Scanner;
public class ucakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int yas,yolculuk;
        double kmFiyat=0.10,km,total,yasIndirimi,yolculukIndirimi,indirimliFiyat;

        System.out.print("Mesafeyi km türünden giriniz :");
        km=input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas=input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculuk=input.nextInt();


        if(km<0 || yas<0 || (yolculuk!=1 && yolculuk!=2)){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else{
            total=km*kmFiyat;
            if(yas<12)
                yasIndirimi=total*0.5;

            else if(yas>=12 && yas<24)
                yasIndirimi=total*0.1;

            else if(yas>65)
                yasIndirimi=total*0.3;

            else yasIndirimi=0;

            indirimliFiyat=total-yasIndirimi;
            if(yolculuk==2){
                indirimliFiyat= indirimliFiyat-(indirimliFiyat*0.2);
                System.out.println("Toplam Tutar = "+indirimliFiyat*2+"TL");
            }
            else System.out.println("Toplam Tutar = "+indirimliFiyat+"TL");
        }

    }
}
