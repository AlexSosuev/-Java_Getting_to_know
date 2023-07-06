package OOP_lesson3.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@AllArgsConstructor
@Setter
public class Box {
    private double weight;

    @Override
    public String toString() {
        return "Box{" + "вес = " + weight + '}';
    }
}
