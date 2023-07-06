package lesson3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentGroupIterator implements Iterator<Student> {

    private final List<Student> students;
    private int position;
    private int lastReturn;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return position < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        lastReturn = position + 1;
        return students.get(position++);
    }

    @Override
    public void remove() {
        if (position <= 0 || lastReturn == -1) {
            throw new IllegalStateException();
        }
        students.remove(--position);
        lastReturn = -1;
    }
}
