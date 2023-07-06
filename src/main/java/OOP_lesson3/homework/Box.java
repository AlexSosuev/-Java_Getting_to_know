package OOP_lesson3.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Box {
    private int weight;

    @Override
    public String toString() {
        return "Вес ящика: " + getWeight();
    }
}