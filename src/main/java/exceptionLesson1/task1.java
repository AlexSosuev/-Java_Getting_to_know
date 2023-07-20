package exceptionLesson1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив. Если длина массива меньше некоторого
// заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

public class task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 78, 3, 5, 6, 8};
        System.err.println(checkLength(array, 5));
    }


    private static int checkLength(int[] array, int min) {
        if (array.length < min) {
            return -1;
        }
        return array.length;
    }
}
