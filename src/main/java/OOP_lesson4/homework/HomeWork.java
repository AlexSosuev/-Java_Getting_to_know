package OOP_lesson4.homework;

public class HomeWork {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(4));
        orangeBox.add(new Orange(7));
//        orangeBox.add(new Apple(2));
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(13));
        appleBox.add(new GoldenApple(8));
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(15));
//        goldenAppleBox.add(new Apple(5));
        System.out.println("Вес коробки с Golden яблоками: " + goldenAppleBox.getWeight());

        goldenAppleBox.moveTo(appleBox);
        System.out.println("Вес исходного ящика с Golden яблоками: " + goldenAppleBox.getWeight());
        System.out.println("Вес ящика с обычными яблоками, после объединения: " + appleBox.getWeight());


        Box<Orange> orangeBox2 = new Box<>();
        orangeBox.moveTo(orangeBox2);
        System.out.println("Вес исходного ящика: " + orangeBox.getWeight());
        System.out.println("Вес нового ящика: " + orangeBox2.getWeight());
    }
}