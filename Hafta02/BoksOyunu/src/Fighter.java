public class Fighter {
    String name;
    int damage;
    int weight;
    int health;
    int dodge;

    Fighter(String name, int damage, int weight, int health, int dodge) {
        this.name=name;
        this.damage=damage;
        this.weight=weight;
        this.health=health;
        if (dodge>=0 && dodge<=100) {
            this.dodge=dodge;
        } else {
            this.dodge=0;
        }
    }
    int hit (Fighter foe) {
        System.out.println(this.name + "=>" + foe.name + " oyuncusuna " + this.damage + " hasar vurdu.");

        if (foe.isDodge()) {
            System.out.println(foe.name + " GELEN HASARI BLOKLADI.");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health-this.damage;
    }
    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber<= this.dodge;
    }

}
