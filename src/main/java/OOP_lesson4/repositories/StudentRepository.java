package OOP_lesson4.repositories;

import OOP_lesson4.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements UserRepository<Student> {

    private final List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public void create(Student student) {
        student.setId(getMaxId() + 1);
        students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public int remove(String fullName) {
        int removeCount = 0;
        for (Student student : students) {
            if (student.getFullName().equals(fullName)) {
                students.remove(student);
                return 1;
//                removeCount++;
            }
        }
        return removeCount;
    }

    private Long getMaxId() {
        Long maxId = 0L;
        for (Student student : students) {
            if (student.getId() > maxId) {
                maxId = student.getId();
            }
        }
        return maxId;
    }
}


