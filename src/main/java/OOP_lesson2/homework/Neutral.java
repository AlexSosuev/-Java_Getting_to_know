package OOP_lesson2.homework;

public class Neutral extends GameObject implements Health{

    public Neutral(int maxHealthPoint, int currentHealthPoint) {
        super(maxHealthPoint, currentHealthPoint);
    }

    @Override
    public int getCurrentHealth() {
        return this.currentHealthPoint;
    }

    @Override
    public int getMaxHealth() {
        return this.maxHealthPoint;
    }
}