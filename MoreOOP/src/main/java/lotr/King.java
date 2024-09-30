package lotr;

import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class King extends Character {
    public King() {
        super(5 + new Random().nextInt(11), 5);
    }
    public void kick(Character c) {
        NobleKick kick = new NobleKick();
        kick.kick(this, c);
    }
}
