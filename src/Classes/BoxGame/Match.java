package Classes.BoxGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
     Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    void start(){
         int count=1;
        if(checkWeight()){
           // System.out.println(f1.health+" "+f2.health);
            System.out.println("Initial Health  for the players "+this.f1.name+": "+this.f1.health+" | "+this.f2.name+": "+this.f2.health);
            int fighterTurn=whoIsFighter();
            System.out.println((fighterTurn==1?f1.name:f2.name)+" will start to the fight first");
            while(this.f1.health>0&&this.f2.health>0){
                System.out.println("-------------Round "+count+". -------------");
                switch (fighterTurn){
                    case 1-> {
                        this.f2.health=this.f1.hit(this.f2);
                        if(isWin(f2)) break;
                        this.f1.health = this.f2.hit(this.f1);
                    }
                    case 2->{
                        this.f1.health = this.f2.hit(this.f1);
                        if(isWin(f1)) break;
                        this.f2.health=this.f1.hit(this.f2);
                    }
                }

                System.out.println(this.f1.name + "'s health: " + this.f1.health);
                System.out.println(this.f2.name +"'s health: "+ this.f2.health);
                if(this.f1.health<=0){
                    System.out.println(this.f1.name+" Lost the Game!");
                    break;
                }
                if(this.f2.health<=0){
                    System.out.println(this.f2.name+" Lost the Game!");
                    break;
                }
                ++count;
            }
        }
        else {
            System.out.println("Weight of the players is out of range! ");
        }
    }
    boolean checkWeight(){
        return (f1.weight>=minWeight&&f1.weight<=maxWeight)&&(f2.weight>=minWeight&&f2.weight<=maxWeight);
    }
    int whoIsFighter(){

         return Math.random()<0.5?1:2;
    }
    boolean isWin(Fighter f){
         return f.health<=0;
    }

}
