package exceptionLesson1;

//1. Создайте boolean метод, который запросит у пользователя поля: login, password и confirm password.
//2. Логин должен содержать только символы: a, b, c, d, e, 0,1, _, если это не так нужно бросить RuntimeException с
// соответствующим сообщением.
//3. Логин должен быть не меньше 4 и не больше 8 символов, если это не так нужно бросить RuntimeException с
// соответствующим сообщением.
//4. Пароль должен быть не меньше 4 и не больше 8 символов и состоять только из цифр, если это не так нужно бросить
// RuntimeException с соответствующим сообщением.
//5. Пароль и его повтор должны совпадать, если это не так нужно бросить RuntimeException с соответствующим сообщением.

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println(registerUser());
    }

    public static boolean registerUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин (только a, b, c, d, e, 0, 1, _,): ");
        String login = scanner.nextLine();
        if (!login.matches("[abcde01_]{4,8}")){
            throw new RuntimeException("Login must be contain a, b, c, d, e, 0, 1, _");
        }
        System.out.print("Введите пароль (только цифры): ");
        String password = scanner.nextLine();
        if (!password.matches("\\d{4,8}")){
            throw new RuntimeException("Password length must be between 4 and 8");
        }
        System.out.print("Повторите пароль (только цифры): ");
        String confirmPassword = scanner.nextLine();
        if (!password.equals(confirmPassword)){
            throw new RuntimeException("Пароли не совпадают");
        }
        return true;
    }
}