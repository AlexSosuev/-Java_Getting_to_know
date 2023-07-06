package OOP_lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addBox(new Box(15));
        container.addBox(new Box(25));
        container.addBox(new Box(3));
        container.addBox(new Box(5));

        System.out.println("1-й контейнер. " + container);
        System.out.println("Содержимое контейнера:");
        container.forEach(System.out::println);

        Container container2 = new Container();
        container2.addBox(new Box(13));
        container2.addBox(new Box(17));
        container2.addBox(new Box(5));

        System.out.println("\n2-й контейнер. " + container2);
        System.out.println("Содержимое контейнера:");
        container2.forEach(System.out::println);

        List<Container> containers = new ArrayList<>();
        containers.add(container);
        containers.add(container2);

        containers.sort(new ContainerCountComparator());
        System.out.println("\nСортируем контейнеры по количеству ящиков:");
        containers.forEach(System.out::println);
    }
}