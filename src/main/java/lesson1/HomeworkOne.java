package lesson1;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();

        int[] arr = createArray(size);
        minMaxArray(arr);

        printMatrix(createMatrix(size));

        System.out.print("Введите Ваше имя: ");
        String name = scanner.next();
        System.out.println(greetings(name));

        System.out.print("Введите шаг сдвига: ");
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(shift(arr, n)));
    }

    private static void printMatrix(int[][] brr) {
        for (int[] ints : brr) {
            for (int j = 0; j < brr.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] createArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(arr) + "\n");
        return arr;
    }

    //Задача 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    private static void minMaxArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение массива равно: " + max);
        System.out.println("Минимальное значение массива равно: " + min + "\n");
    }

    //Задача 2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    // цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];
    private static int[][] createMatrix(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
            arr[arr.length - 1 - i][i] = 1;
        }
        return arr;
    }

    //Задача 3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    private static String greetings(String name) {
        int hour = LocalDateTime.now().getHour();
        if (hour >= 5 && hour < 12) {
            return "Доброе утро, " + name + "!";
        }
        if (hour >= 12 && hour < 18) {
            return "Добрый день, " + name + "!";
        }
        if (hour >= 18 && hour < 23) {
            return "Добрый вечер , " + name + "!";
        }
        return "Доброй ночи, " + name + "!";
    }

    //4.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
    // отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один
    // вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону
    // сдвиг можете выбирать сами.

    private static int[] shift(int[] arr, int n) {
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else {
            for (int i = 0; i < Math.abs(n); i++) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }
        return arr;
    }
}