import java.util.Scanner;

public class sicakligaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */
        Scanner input = new Scanner(System.in);
        double hava;
        System.out.print("Hava sıcaklığı= ");
        hava = input.nextDouble();

        System.out.println(hava < 5 ? "Kayak yapabilirsiniz" : hava >= 5 && hava < 15 ? "Sinemaya gidebilirsiniz." : hava >= 15 && hava < 25 ? "Piknik yapabilirsiniz." : "Yüzebilirsiniz.");
        /*if(hava<5)
            System.out.println("Kayak yapabilirsiniz.");
        else if(hava>=5 && hava<15)
            System.out.println("Sinemaya gidebilirsiniz.");
        else if(hava>=15 && hava<25)
            System.out.println("Piknik yapabilirsiniz");
        else System.out.println("Yüzebilirsiniz");*/
    }
}
