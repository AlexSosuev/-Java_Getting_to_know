package lesson3;

import lombok.Value;

@Value
public class Student implements Comparable<Student> {
    private final Long id;
    private String name;


    @Override
    public int compareTo(Student o) {
        return (int) (id - o.id);
    }
}
