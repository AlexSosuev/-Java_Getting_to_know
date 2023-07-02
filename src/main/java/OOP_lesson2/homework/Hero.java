package OOP_lesson2.homework;

public class Hero extends GameObject implements Health, Mana{

    private final int maxMana;
    private final int currentMana;

    public Hero(int maxHealthPoint, int currentHealthPoint, int maxMana, int currentMana) {
        super(maxHealthPoint, currentHealthPoint);
        this.currentMana = currentMana;
        this.maxMana = maxMana;
    }

    @Override
    public int getCurrentHealth() {
        return this.currentHealthPoint;
    }

    @Override
    public int getMaxHealth() {
        return this.maxHealthPoint;
    }

    @Override
    public int getCurrentMana() {
        return this.currentMana;
    }

    @Override
    public int getMaxMana() {
        return this.maxMana;
    }
}