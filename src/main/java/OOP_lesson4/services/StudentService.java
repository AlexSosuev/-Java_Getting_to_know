package OOP_lesson4.services;

import OOP_lesson4.models.Student;
import OOP_lesson4.repositories.UserRepository;

import java.util.List;

public class StudentService implements UserService<Student> {

    private final UserRepository<Student> userRepository;

    public StudentService(UserRepository<Student> userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {

        userRepository.create(new Student(fullName, age, phoneNumber));
    }

    @Override
    public List<Student> getAll() {
        return userRepository.getAll();
    }

    @Override
    public int remove(String fullName) {
        return userRepository.remove(fullName);
    }
}
