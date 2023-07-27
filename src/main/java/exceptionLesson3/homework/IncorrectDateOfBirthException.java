package exceptionLesson3.homework;

public class IncorrectDateOfBirthException extends RuntimeException {
    public IncorrectDateOfBirthException() {
        super("Введенная строка не является датой. Ожидается дата в формате dd.MM.yyyy");
    }
}