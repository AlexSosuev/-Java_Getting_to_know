package OOP_lesson1.homework;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animals {
    private String nickname;
    private int age;
    private String color;
    private String breed;

    public abstract void makeSound();

    public abstract void eat(int kg);

    public abstract void move();

    public abstract void sleep();
}