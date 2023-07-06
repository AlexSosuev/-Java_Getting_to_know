package OOP_lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(5);
        Box box3 = new Box(8);

        List<Box> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);

        Container container = new Container(boxes);

        System.out.println("Общий вес контейнера: " + container.getTotalWeight());

        // Итерирование по ящикам внутри контейнера
        for (Box box : container) {
            System.out.println("Вес коробки: " + box.getWeight());
        }

        ContainerCountComparator countComparator = new ContainerCountComparator();
        int result = countComparator.compare(container1, container2);
        System.out.println("Comparison result based on box count: " + result);
    }
}