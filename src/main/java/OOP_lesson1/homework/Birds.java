package OOP_lesson1.homework;

public class Birds extends Animals {
    public Birds(String nickname, int age, String color, String breed) {
        super(nickname, age, color, breed);
    }

    @Override
    public void makeSound() {
        System.out.println(getNickname() + " чирикает!");
    }

    @Override
    public void eat(int kg) {
        System.out.println("Птички едят впрок, поэтому может и не хватить " + kg + " кг еды");
    }

    @Override
    public void move() {
        System.out.println("Птицы летают");
    }

    @Override
    public void sleep() {
        System.out.println("Спит очень мало.");
    }
}
