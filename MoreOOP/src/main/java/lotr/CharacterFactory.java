package lotr;

import java.util.Random;

public class CharacterFactory {
    public static Character CreateCharacter() {
        Random random = new Random();
        int rand = random.nextInt(101);
        
        if (rand <= 30) {
            return new Elf();
        } else if (rand <= 80) {
            return new Knight();
        } else if (rand <= 99) {
            return new King();
        } else {
            return new Hobbit();
        }
    }
}