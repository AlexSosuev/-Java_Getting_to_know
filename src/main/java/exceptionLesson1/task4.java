package exceptionLesson1;
//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//Метод должен пройтись по каждому элементу и проверить что он не равен null. Реализуйте следующую логику:
//1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

import java.util.List;
import java.util.stream.IntStream;

public class task4 {
    public static void main(String[] args) {
        checkArray(new Integer[]{1, 2, 3, null, 5, 6, null});
    }

    public static void checkArray(Integer[] arr) {
        List<Integer> indexex = IntStream
                .range(0, arr.length)
                .filter(i -> arr[i] == null)
                .boxed().toList();
        if (indexex.size() > 0) {
            throw new RuntimeException("Next cell is null" + indexex);
        }

        System.out.println("Array n not contains NULL");
    }
}