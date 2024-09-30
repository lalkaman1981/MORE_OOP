package lotr;

import java.util.Random;

class CharacterFactory {
    private Class<? extends Character>[] characterClasses;
    private Random random;

    public CharacterFactory() {
        characterClasses = new Class[] {Hobbit.class, Elf.class, King.class, Knight.class};
        random = new Random();
    }

    public Character createCharacter() {
        try {
            int index = random.nextInt(characterClasses.length);
            return characterClasses[index].getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
