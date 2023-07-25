package exceptionLesson2;

import java.util.Scanner;

public class Homework {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float number = getFloatInput();
        System.out.println("Введенное число - " + number);

        homeWork2();

        homeWork3();

        homeWork4();
    }

    /**
     * Задача 1.
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
     * значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
     * запросить у пользователя ввод данных.
     */

    private static float getFloatInput() {
        while (true) {
            System.out.println("Введите дробное число: ");
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Введено некоректное значение! Повторите ввод ...");
            }
        }
    }

    /**
     * Задание 2
     */
    private static void homeWork2() {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    /**
     * Задание 3
     */
    private static void homeWork3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    private static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    /**
     * Задание 4
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
     * показаться сообщение, что пустые строки вводить нельзя.
     */
    private static void homeWork4() {
        try {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                throw new Exception("Ошибка! Пустые строки вводить нельзя.");
            }
            System.out.println("Вы ввели строку: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}