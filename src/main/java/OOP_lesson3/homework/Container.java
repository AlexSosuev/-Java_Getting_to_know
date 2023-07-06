package OOP_lesson3.homework;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.List;

@AllArgsConstructor
public class Container implements Comparable<Container>, Iterable<Box>{
    private List<Box> boxes;

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Box box : boxes) {
            totalWeight += box.getWeight();
        }
        return totalWeight;
    }

    @Override
    public int compareTo(Container other) {
        return Double.compare(this.getTotalWeight(), other.getTotalWeight());
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}
