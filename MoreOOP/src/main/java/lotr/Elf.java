package lotr;

import lotr.kickstrategy.ElfKick;

public class Elf extends Character{
    public Elf() {
        super(10, 10);
        
    }
    public void kick(Character c) {
        ElfKick kick = new ElfKick();
        kick.kick(this, c);
    }
}
