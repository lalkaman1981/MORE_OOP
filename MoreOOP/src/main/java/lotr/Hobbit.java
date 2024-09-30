package lotr;
import lotr.kickstrategy.HobbitKick;

public class Hobbit extends Character {

    public Hobbit() {
        super(3,0);
    }

    public void kick(Character c) {
        HobbitKick kick = new HobbitKick();
        kick.kick(this, c);
    }

}