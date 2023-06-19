package lesson4;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Homework {

    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     * 4. Если введено exit, то программа завершается
     * <p>
     * > - ввод в консоль (stdin), < - вывод на консоль (stdout)
     * > java
     * > python
     * > c#
     * > print
     * < [c#, python, java]
     * > revert
     * > print
     * < [python, java]
     * > revert
     * > revert
     * > print
     * < []
     * > revert -> throw new NoSuchElementException
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> lines = new LinkedList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            if (input.equals("print")) {
                System.out.println(lines);
            } else if (input.equals("revert")) {
                if (!lines.isEmpty()) {
                    lines.remove();
                } else {
                    throw new NoSuchElementException("Список пуст");
                }
            } else {
                lines.addFirst(input);
            }
        }
        scanner.close();
    }
}
