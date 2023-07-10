package OOP_lesson4.controllers;

import OOP_lesson4.models.Student;
import OOP_lesson4.services.UserService;

import java.util.List;

public class StudentController implements UserController<Student> {

    private final UserService<Student> userService;

    public StudentController(UserService<Student> userService) {
        this.userService = userService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        userService.create(fullName, age, phoneNumber);
    }

    @Override
    public List<Student> getAll() {
        return userService.getAll();
    }

    @Override
    public int remove(String fullName) {
        return userService.remove(fullName);
    }
}
