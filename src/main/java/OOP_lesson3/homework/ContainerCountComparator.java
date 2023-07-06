package OOP_lesson3.homework;

import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {
    @Override
    public int compare(Container o1, Container o2) {
        return Integer.compare(o1.getSizeContainer(), o2.getSizeContainer());
    }
}