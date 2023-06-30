package OOP_lesson1.homework;

public class Reptiles extends Animals {
    public Reptiles(String nickname, int age, String color, String breed) {
        super(nickname, age, color, breed);
    }

    @Override
    public void makeSound() {
        System.out.println(getNickname() + " шипит!");
    }

    @Override
    public void eat(int kg) {
        System.out.println("Рептилии очень много едят, поэтому несите еще.");
    }

    @Override
    public void move() {
        System.out.println("Рептилии ползают.");
    }

    @Override
    public void sleep() {
        System.out.println("Спит, когда не ест");
    }
}
