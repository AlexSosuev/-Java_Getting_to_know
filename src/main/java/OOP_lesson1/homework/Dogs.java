package OOP_lesson1.homework;

public class Dogs extends Animals {
    @Override
    public void makeSound() {
        System.out.println(getNickname() + " гавкает!");
    }

    @Override
    public void eat(int kg) {
        System.out.println("Собака съедает " + kg + " кг. корма в месяц.");
    }

    @Override
    public void move() {
        System.out.println("Собака бегает");
    }

    @Override
    public void sleep() {
        System.out.println("Спит, когда отдыхает))");
    }

    public Dogs(String nickname, int age, String color, String breed) {
        super(nickname, age, color, breed);
    }


}
