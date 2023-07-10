package OOP_lesson4.homework;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public int getWeight() {
        return fruits.stream().mapToInt(T::getWeight).sum();
    }

    public void moveTo(Box<? super T> otherBox) {
      otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}