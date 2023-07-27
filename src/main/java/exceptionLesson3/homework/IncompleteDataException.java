package exceptionLesson3.homework;

public class IncompleteDataException extends IllegalArgumentException {
    public IncompleteDataException(String[] data) {
        if (data.length < 6) {
            System.out.println("Мало данных. Ожидается 6 значений.");
        } else {
            System.out.println("Много данных. Ожидается 6 значений.");
        }
    }
}