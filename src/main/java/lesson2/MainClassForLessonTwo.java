package lesson2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

public class MainClassForLessonTwo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четное положительное число N: ");
        int N = scanner.nextInt();
        System.out.println(one(N));
        two();
        tree();
        four();
    }

    //Задание 1. Дано четное число N>0 и символы c1 и c2. Написать метод, который вернет строку
    // длины N, которая состоит из чередующихся символов c1 и с2, начиная с c1.
    private static String one(int N) {
        String c1 = "A";
        String c2 = "Y";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i += 2) {
            stringBuilder.append(c1).append(c2);
        }
        return stringBuilder.toString();
    }

    //Задание 2. Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
    private static void two() {
        StringBuilder sb = new StringBuilder();
        String s = "aaaabbbcddccfr";
        char index = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == index) {
                count++;
            } else {
                if (count != 1) {
                    sb.append(index).append(count);
                } else {
                    sb.append(index);
                }
                count = 1;
                index = s.charAt(i);
            }
        }
        if (count != 1) {
            sb.append(index).append(count);
        } else {
            sb.append(index);
        }
        System.out.println(sb);
    }

    //Задание 4. Напишите метод, который составит строку, состоящуюиз 100 поаторений слова TEST
    //и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
    private static void tree() throws IOException {
        File file = new File("src/main/java/lesson2/text.txt");
        StringBuilder sb = new StringBuilder();
        sb.append("TEXT".repeat(100));

        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8)) {
            osw.write(String.valueOf(sb));
            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Задание 5. Напишите метод, который вернет содержимое текущей папки в виде массива строк.
    //Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
    //Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
    //оно должно записаться в лог-файл.

    private static void four() {
        File file = new File("src/main/java/lesson2/text2.txt");
        String pathProject = System.getProperty("user.dir");
        File dir = new File(pathProject);
        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos,
                     StandardCharsets.UTF_8)) {
            for (String fname : Objects.requireNonNull(dir.list())) {
                osw.write(fname + "\n");
            }
            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}