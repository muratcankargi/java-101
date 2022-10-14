package BoksGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            double firstDamage = Math.random() * 100;
            System.out.println(firstDamage);
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("===NEW ROUND====");
                if (firstDamage > 50) {
                    this.f2.health = this.f1.hit(f2);

                    if (isWin())
                        break;

                    this.f1.health = this.f2.hit(f1);
                    if (isWin())
                        break;
                } else {
                    this.f1.health = this.f2.hit(f1);

                    if (isWin())
                        break;

                    this.f2.health = this.f1.hit(f2);

                    if (isWin())
                        break;
                }
                System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
            }
        } else {
            System.out.println("Boksörler aynı siklette değil.");
        }
    }

    boolean isCheck() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println(f2.name + " kazandı!");
            return true;
        }
        if (f2.health == 0) {
            System.out.println(f1.name + " kazandı!");
            return true;
        }
        return false;
    }
}
