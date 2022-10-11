import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1500;
        int right = 3;
        int choice;
        int money;
        String nickname = "kodluyoruz";
        String password = "patika123";

        while (right != 0) {
            System.out.print("Kullanıcı adı : ");
            String nicknameTry = input.nextLine();

            System.out.print("Şifre : ");
            String passwordTry = input.nextLine();

            if (nicknameTry.equals(nickname) && passwordTry.equals(password)) {
                System.out.println("Hoşgeldiniz!");
                do {
                    System.out.print("Hangi işlemi yapmak istersiniz(1,4)?\n1-Para yatırma\n2-Para çekme\n3-Bakiye sorgulama\n4-Çıkış\nSeçiniz : ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            money = input.nextInt();
                            if (money > 0) {
                                System.out.println("Yüklediğiniz tutar : " + money);
                                balance += money;
                                System.out.println("Güncel bakiyeniz : " + balance);
                            } else System.out.println("İşlem gerçekleştirilemedi!");

                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            money = input.nextInt();
                            if (money > 0 && money <= balance) {
                                System.out.println("Çektiğiniz tutar : " + money);
                                balance -= money;
                                System.out.println("Güncel bakiyeniz : " + balance);
                            } else System.out.println("İşlem gerçekleştirilemedi!");

                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("İyi günler dileriz.");
                            right=0;
                            break;
                        default:
                            System.out.println("Geçersiz seçim yaptınız!");
                            break;
                    }
                }while (choice!=4);

            } else {
                System.out.println("Kullanıcı adı veya şifrenizi yanlış girdiniz.");
                right--;
                if (right==0)
                    System.out.println("Çok fazla başarısız giriş denemesinde bulundunuz. Daha sonra tekrar deneyiniz.");

            }
        }

    }
}
