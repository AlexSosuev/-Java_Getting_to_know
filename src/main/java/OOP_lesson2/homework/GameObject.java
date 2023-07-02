package OOP_lesson2.homework;

public abstract class GameObject {
    int maxHealthPoint;
    int currentHealthPoint;

    public GameObject(int maxHealthPoint, int currentHealthPoint){
        this.currentHealthPoint = currentHealthPoint;
        this.maxHealthPoint = maxHealthPoint;
    }
}
