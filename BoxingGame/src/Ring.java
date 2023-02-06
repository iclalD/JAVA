public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("=======YENİ ROUND=======");

                if (start()) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }

                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight <= maxWeight && f1.weight >= minWeight) && (f2.weight <= maxWeight && f2.weight >= minWeight);
    }

    public boolean isWin() {
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

    public void printScore() {
        System.out.println("\n" + f1.name + " kalan can: " + f1.health);
        System.out.println(f2.name + " kalan can: " + f2.health + "\n");
    }

    public boolean start() {
        double randomValue = Math.random() * 100;
        return randomValue <= 50;
    }
}



























