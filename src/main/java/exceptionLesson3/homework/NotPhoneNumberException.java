package exceptionLesson3.homework;

public class NotPhoneNumberException extends NumberFormatException{
    public NotPhoneNumberException() {
        super("Введенная строка не является номером телефона");
    }
}