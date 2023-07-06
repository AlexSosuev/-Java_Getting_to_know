package lesson3;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@Getter
public class StudentGroup implements Iterable<Student> {
    private final List<Student> students;

    public StudentGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }
}
