public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    void run() {
        if (isCheck()) {
            while (this.f1.health>0 && this.f2.health>0) {
                System.out.println("***YENİ ROUND***");
                if (firstToAttack() == true) {
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name + " sağlık = " + this.f2.health);
                    System.out.println(this.f1.name + " sağlık =  " + this.f1.health);
                    if (isWin()){
                        break;
                    }
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name + " sağlık  =  " + this.f1.health);
                    System.out.println(this.f2.name + " sağlık = " + this.f2.health);
                    if (isWin()) {
                        break;
                    }
                }
            }

        } else {
            System.out.println("Sporcuların sikletleri uyumlu değil.");
        }
    }
    boolean isCheck() {
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }
    boolean isWin() {

        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı.");
            return true;
        }
        if (this.f2.health==0) {
            System.out.println(this.f1.name + " kazandı.");
            return true;
        }
        return false;
    }
    boolean firstToAttack () {
        int number = (int)(Math.random()*100);
        if (number <= 50) {
            return true; // if it is true, then f1 will start.
        }
        return false;
    }
}
