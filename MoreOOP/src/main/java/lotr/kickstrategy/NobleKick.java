package lotr.kickstrategy;
import java.util.Random;

import lotr.Character;

public class NobleKick implements Kick{
    public void kick(Character kicker, Character kicked) {
        Random random = new Random();
        int randomNumber = kicker.getPower() + random.nextInt(11);
        kicked.setHp(kicked.getHp() - randomNumber);
    }
}