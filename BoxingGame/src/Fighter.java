public class Fighter {
    String name;
    int weight;
    int health;
    int damage;
    double dodge;

    public Fighter(String name, int weight, int health, int damage, double dodge) {
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.damage = damage;
        this.dodge = dodge;
    }

    public int hit(Fighter opponent) {
        System.out.println(this.name + " --> " + opponent.name + " (-" + this.damage + ") ");

        if (opponent.dodge()) {
            System.out.println(opponent.name + " gelen hasarı savurdu.");
            return opponent.health;
        }

        if (opponent.health - this.damage < 0)
            return 0;

        return opponent.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;   //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}
