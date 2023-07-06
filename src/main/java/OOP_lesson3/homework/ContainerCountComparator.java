package OOP_lesson3.homework;

import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {
    @Override
    public int compare(Container c1, Container c2) {
        return Integer.compare(c1.size(), c2.size());
    }
}
