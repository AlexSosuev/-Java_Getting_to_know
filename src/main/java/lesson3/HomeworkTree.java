package lesson3;

import java.util.*;

public class HomeworkTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();

        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            integers.add(random.nextInt(100));
        }
        System.out.println(integers);

        System.out.println("Значение максимального элемента списка: " + Collections.max(integers));

        System.out.println("Значение минимального элемента списка: " + Collections.min(integers));

        double sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        System.out.println("Среднее значение элементов списка равно: " + String.format("%.2f", sum / size));

        int k = 0;
        while (k < integers.size()) {
            if (integers.get(k) % 2 == 0) {
                integers.remove(k);
            } else {
                k++;
            }
        }
        System.out.println("Исходный список, после удаления четных элементов: " + integers);
    }
}