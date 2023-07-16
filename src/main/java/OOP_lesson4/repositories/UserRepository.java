package OOP_lesson4.repositories;

import OOP_lesson4.models.Student;
import OOP_lesson4.models.User;

import java.util.List;

public interface UserRepository <T extends User> {
    void create(T user);

    List<T> getAll();

    int remove(String fullName);

    List<T> getAllByGroupTitle(String groupTitle);
}
