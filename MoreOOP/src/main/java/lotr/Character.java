package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp >0;
    }

    public void setHp(int hp) {
        this.hp = hp < 0 ? 0: hp;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power +"}";
    }
}