package lesson3;

import java.util.*;
import java.util.stream.Collectors;

public class MainClassForLessonTree {
    public static void main(String[] args) {
        //listTest();
        //oe1();
        //oe2();
//        oe3();
//        oe4();
        oe5();
    }

    private static void listTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0, 9);
        Collections.addAll(list, 1, 2, 3, 4, 5, 6);
//        System.out.println(list);

//        Integer[] ints = (Integer[]) list.toArray();
        Integer[] ints2 = list.toArray(new Integer[]{});
        test(1, 2, 3, 4, 5, 6);
    }

    private static void test(Integer... arr) {
        for (Integer integer : arr) {
            System.out.println("value: " + integer);
        }
    }

    private static void oe1() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1.equals(s5));
        System.out.println(Objects.equals(s1, s6));
        System.out.println(s1.equalsIgnoreCase(s5));
    }

    private static void oe2() {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(random.nextInt(100));
        }
        //integers.sort(Comparator.naturalOrder());
        //Collections.sort(integers, Comparator.reverseOrder());
        Collections.sort(integers);
        System.out.println(integers);
    }

    //Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
    private static void oe3() {
        List<String> planets = List.of("Mercury", "Venus", "Earth", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto");
        Random random = new Random();
        int n = 100;
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            temp.add(planets.get(random.nextInt(planets.size())));
        }
        int count = 0;
        for (String planet : planets) {
            for (String s : temp) {
                if (planet.equals(s)) {
                    count++;
                }
            }
            System.out.println(planet + ": " + count);
            count = 0;
        }
    }

    //Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
    private static void oe4() {
        List<String> planets = List.of("Mercury", "Mars", "Venus", "Earth", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto");
        Random random = new Random();
        int n = 100;
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            temp.add(planets.get(random.nextInt(planets.size())));
        }
        System.out.println(temp);

        int i = 0;
        while (i < temp.size()) {
            int j = i + 1;
            while (j < temp.size()) {
                if (temp.get(i).equals(temp.get(j))) {
                    temp.remove(j);
                } else {
                    j++;
                }
            }
            i++;
        }
        System.out.println(temp);
    }

    // Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
    // Пройти по списку, найти и удалить целые числа.
    private static void oe5() {
        List<String> strings = List.of("4", "qwe", "5", "8", "hello");
        int sum = 0;
        for (String string : strings) {
            try {
                sum += Integer.parseInt(string);
            } catch (NumberFormatException e) {
                System.err.println("Невозможно перевести в строку: " + string);
            }
        }
        System.out.println("sum: " + sum);
    }
}