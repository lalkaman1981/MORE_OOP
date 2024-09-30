package lotr;

import java.util.Random;

public class GameManager {

    public void fight(Character c1, Character c2) {

        if (c1 instanceof Hobbit && c1 instanceof Hobbit) {

            System.out.println("The REAL battle begins");
            int number = new Random().nextInt(2);
            System.out.println("After intensive battle, wins...");
            if (number == 0) {
                System.out.println("Hobbit1 sad to Hobbit2: stand proud, you are strong");
                System.out.println("After Middle-earth showdown... Hobbit1 wins");
                System.out.println("Their fight: https://www.youtube.com/watch?v=fRVzCmJMTQ8");
            } else {
                System.out.println("*Flashback*");
                System.out.println("-If you and Hobbit2 will fight... Who would win?");
                System.out.println("-I think, his ring could give me some troubles");
                System.out.println("-But would you lose?");
                System.out.println("-Nah, i'd win");
                System.out.println("*Now*");
                System.out.println("Hobbit1 wins, it was the end of Middle-earth showdown");
            }
            return;
        }

        System.out.println("The battle begins!");

        while (true) {

            c1.kick(c2);

            if (c2.getHp() == 0) {
                System.out.println("Player number 1 wins (number 2 got skill issue)");
                return;
            }

            c2.kick(c1);

            if (c2.getHp() == 0) {
                System.out.println("Player number 2 wins (number 1 got skill issue)");
                return;
            }
        }
    }
}
