package OOP_lesson2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserService {

    private String name;
    private static UserService instance;

    private UserService() {}

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }

        return instance;
    }

}
