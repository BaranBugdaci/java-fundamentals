package Classes.BoksGame;

public class Ring
{
   Fighter f1;
   Fighter f2;
    int maxWeight;
    int minWeight;

    public Ring(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run(){
        if (checkWeight()){
            double randomValue = Math.random() * 100;
            if(randomValue <= 50){
                Fighter temp;
                temp = f1;
                f1 = f2;
                f2 = temp;
            }
            while(f1.health > 0 && f2.health > 0 ){
                f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                printScore();
            }
        }else{
            System.out.println("Sporcuların Ağırlıkları Uyuşmuyor...");
        }
    }
    public boolean checkWeight (){
        return ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight));
    }

    public boolean isWin() {
        if (f1.health == 0){
            System.out.println(f2.name + " Kazandı!");
        return true;
    }  else if(f2.health == 0){
            System.out.println(f1.name + " Kazandı!");
            return true;
        }
        return false;
    }

    void printScore(){
        System.out.println(f1.name +  "Kalan Canı: " + f1.health);
        System.out.println(f2.name + "Kalan Canı: " + f2.health);

    }



}

