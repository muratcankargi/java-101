
public class asalSayilar {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 100; i++) {

            if(i==1)
                continue;

            for (int j = 2; j <i; j++) {
                if (i % j == 0 )
                    counter++;
            }
            if (counter == 0) {
                System.out.print(i + " ");
            }
            counter=0;
        }
    }
}
