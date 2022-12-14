package Classes.BoxGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    public Fighter(String name,int damage,int health,int weight, double dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }
    int hit(Fighter foe) {//this fighter hits the opponent foe
        if (foe.health - this.damage < 0) {
        System.out.println(this.name + " --> " + foe.name + " damaged with " + this.damage + " points.");
        if(foe.isDodge()) {//is opponent has a chance to dodge
            System.out.println("Player "+foe.name+" dodged the attack.");
            return foe.health;
        }
        return 0;
    }
        System.out.println(this.name+" --> "+foe.name+" damaged with "+this.damage+" points.");
        if(foe.isDodge()){
            System.out.println("Player "+foe.name+" dodged the attack.");
            return foe.health;
        }
        return foe.health-this.damage;
    }
    boolean isDodge(){
        return Math.random()*100<=this.dodge;//create random number and so making a dodge chance
    }
}
