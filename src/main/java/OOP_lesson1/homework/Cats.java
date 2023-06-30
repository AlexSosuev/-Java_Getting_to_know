package OOP_lesson1.homework;

public class Cats extends Animals {

    public Cats(String nickname, int age, String color, String breed) {
        super(nickname, age, color, breed);
    }

    @Override
    public void makeSound() {
        System.out.println(getNickname() + " мяукает!");
    }

    @Override
    public void eat(int kg) {
        System.out.println("Кошка съедает " + kg + " кг. корма в месяц.");
    }

    @Override
    public void move() {
        System.out.println("Кошка прыгает");
    }

    @Override
    public void sleep() {
        System.out.println("Спит столько, сколько хочет.");
    }
}
