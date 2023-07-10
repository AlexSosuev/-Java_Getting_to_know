package OOP_lesson4.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public abstract class User {
    private Long id;
    private String fullName;
    private Integer age;
    private String phoneNumber;

    public User(String fullName, Integer age, String phoneNumber) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}
