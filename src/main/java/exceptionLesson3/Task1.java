package exceptionLesson3;

import java.io.FileReader;
import java.io.IOException;

/**
 Создайте метод doSomething(), который может быть источником одного
 из типов checked exceptions(тело самого метода прописывать не обязательно).
 Вызовите этот метод из main и обработайте в нем исключение, которое вызвал
 метод doSomething().
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            System.out.println("SomethingException");
            throw new RuntimeException();
        }
    }

    private static void doSomething() throws Exception{
        FileReader reader = new FileReader("");
        System.out.println("Exceptions");
    }
}