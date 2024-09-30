package lotr;

import java.util.Random;

import lotr.kickstrategy.NobleKick;

public class Knight extends Character {
    public Knight() {
        super(2 + new Random().nextInt(11), 2);
    }

    public void kick(Character c) {
        NobleKick kick = new NobleKick();
        kick.kick(this, c);
    }
}
