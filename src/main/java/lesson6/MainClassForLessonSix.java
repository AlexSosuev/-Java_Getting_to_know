package lesson6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class MainClassForLessonSix {
    public static void main(String[] args) {
        List<String> data = List.of("Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять");
        System.out.println(new HashSet<>(data));
        System.out.println(new LinkedHashSet<>(data));
        System.out.println(new TreeSet<>(data));
    }
}
