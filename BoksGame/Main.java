package BoksGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1= new Fighter("Murat",15,85,100,50);
        Fighter f2= new Fighter("Ahmet",10,100,100,50);

        Match match= new Match(f1,f2,90,110);
        match.run();
    }
}
