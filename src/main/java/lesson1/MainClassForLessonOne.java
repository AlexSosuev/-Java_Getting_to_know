package lesson1;

import java.util.Arrays;

public class MainClassForLessonOne {
    public static void main(String[] args) {
        one();
        System.out.println(two(new String[]{"flower", "flow", "flight"}));
        tree();
        reverse();
    }

    //Подсчитать максимальное количество подряд идуших единиц в данном массиве
    private static void one() {
        int[] arr = new int[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1};
        int count = 0;
        int max = 0;
        for (int j : arr) {
            if (j == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }

    // Написать метод, которыйнаходит самую длинную строку общего префикса среди массива строк.
    // Если общего префикса нет, вернуть пустую строку ""
    private static int two(String[] arr) {
        if (arr.length == 0) {
            return 0;

        } else if (arr.length == 1) {
            return arr.length;
        } else {
            String rez = arr[0];
            for (int i = 1; i < arr.length; i++) {
                String cur = arr[i];
                int reader = 0;
                int lastCommon = 0;
                while (reader < rez.length() && reader < cur.length()) {
                    if (rez.charAt(reader) == cur.charAt(reader)) {
                        lastCommon++;
                    } else {
                        break;
                    }
                    reader++;
                }
                rez = rez.substring(0, lastCommon);
            }
            return rez.length();
        }
    }

    //Дан массив nums = [3,2,2,3] и число val = 3.
    //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
    // а остальные - равны ему.
    private static void tree() {
        int[] nums = new int[]{7, 3, 2, 2, 3, 7};
        int val = 3;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    //Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
    private static void reverse() {
        String s = "Добро пожаловать на курс по Java";
        String[] s1 = s.split("\\s+");
        for (int i = 0; i < s1.length / 2; i++) {
            String tmp = s1[i];
            s1[i] = s1[s1.length - 1 - i];
            s1[s1.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(s1));
    }
}

