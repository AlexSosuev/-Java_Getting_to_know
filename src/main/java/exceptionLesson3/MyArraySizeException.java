package exceptionLesson3;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Массив не квадратный!");
    }
}