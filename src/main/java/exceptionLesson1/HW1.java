package exceptionLesson1;

public class HW1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = new int[3];
        System.out.println(arr[10]);


    }

    public static void divisionByZero() {
        System.out.println(10 / 0);

    }

    public static void numberFormatException() {
        System.out.println(Integer.parseInt("Число"));
    }
}