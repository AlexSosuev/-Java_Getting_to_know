package OOP_lesson3.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Comparable<Container>, Iterable<Box> {
    private final List<Box> boxes;

    public Container() {
       this.boxes=new ArrayList<>();
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public int getTotalWeight() {
        return boxes.stream().mapToInt(Box::getWeight).sum();
    }

    public int getSizeContainer(){
        return this.boxes.size();
    }

    @Override
    public int compareTo(Container other) {
        return Integer.compare(this.getTotalWeight(), other.getTotalWeight());
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }

    @Override
    public String toString() {
        return "Общий вес контейнера: " + getTotalWeight()
                + " ед., количество ящиков в контейнере - " + getSizeContainer() + " шт.";
    }
}