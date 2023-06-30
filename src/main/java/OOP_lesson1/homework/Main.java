package OOP_lesson1.homework;

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
                new Cats("Мурзик", 4, "рыжий", "дворовый"),
                new Dogs("Бобик", 10, "серый", "терьер"),
                new Birds("Кеша", 2, "разноцветный", "жако"),
                new Reptiles("Каа", 40, "зеленый", "Тигровый питон")
        };

        for (Animals animal : animals) {
            animal.eat(4);
            animal.makeSound();
        }
    }
}