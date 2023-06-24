package lesson5;

import java.util.LinkedHashMap;
import java.util.Map;

public class JobInClass {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число в римской системе счисления: ");
//        String input = scanner.nextLine();
//        System.out.println(ex1(input));
        System.out.println(ex2(49));
    }
    /*Написать метод, который переведет число из римского формата записи в арабский.
    Например, MMXXII = 2022*/

    private static int ex1(String romanNum) {
        Map<Character, Integer> db = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int sum = 0;
        for (int i = 0; i < romanNum.length(); i++) {
            int tempValue = db.get(romanNum.charAt(i));
            if (i < romanNum.length() - 1 && tempValue < db.get(romanNum.charAt(i + 1))) {
                sum -= tempValue;
            } else {
                sum += tempValue;
            }
        }
        return sum;
    }

    private static String ex2(int number) {
        Map<Integer, String> db = new LinkedHashMap<>() {{
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }};
        StringBuilder sb = new StringBuilder();
        for (Integer key : db.keySet()) {
            while (number >= key) {
                sb.append(db.get(key));
                number -= key;
            }
        }
        return sb.toString();
    }
}