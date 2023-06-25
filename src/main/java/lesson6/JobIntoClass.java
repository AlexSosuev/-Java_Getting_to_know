package lesson6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class JobIntoClass {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0(){
        Random random = new Random();
        Integer[] numbers = new Integer[1000];
        for (int i = 0; i < 1000; i++) {
            numbers[i] = random.nextInt(1001);
        }

        Set<Integer> intSet = new HashSet<>();
        Collections.addAll(intSet, numbers);
        System.out.println(intSet.size());
        double percent = intSet.size() * 1.0 * 100 / numbers.length;
        System.out.println(percent);
    }
}
