package exceptionLesson3.homework;

public class NotPhoneNumberFormatException extends IllegalArgumentException{
    public NotPhoneNumberFormatException() {
        super("Неправильный формат номера телефона. Ожидается номер из 11 цифр");
    }
}