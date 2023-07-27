package exceptionLesson3.homework;

public class IncorrectGenderValueException extends IllegalArgumentException{
    public IncorrectGenderValueException() {
        super("Неверное значение пола. Ожидается 'f' или 'm'.");
    }
}