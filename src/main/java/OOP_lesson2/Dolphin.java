package OOP_lesson2;

import java.io.Serializable;

public class Dolphin implements Swimming, TestInterface, Serializable, Cloneable {
    @Override
    public void swim() {
        System.out.println("Дельфин плывет");
    }

    @Override
    public void sayHello() {
        Swimming.super.sayHello();
    }

    @Override
    public void test() {
        System.out.println("One more method");
    }

    @Override
    public Dolphin clone() {
        try {
            return (Dolphin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
