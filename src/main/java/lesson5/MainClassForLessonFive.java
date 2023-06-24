package lesson5;

import java.util.Map;
import java.util.TreeMap;

public class MainClassForLessonFive {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        Map<String, String> employeeMap = new TreeMap<>();
        employeeMap.put("1234", "Иванов");
        employeeMap.put("1434", "Петров");
        employeeMap.put("3434", "Романцев");
        employeeMap.put("5467", "Князев");

        System.out.println(employeeMap);

        /*Set<String> keySet = employeeMap.keySet();
        System.out.println(keySet);*/

/*        for (String key : employeeMap.keySet()) {
            System.out.printf("%s\t->\t%s%n", key, employeeMap.get(key));
        }*/

        /*Set<Map.Entry<String,String>> entrySet = employeeMap.entrySet();
        System.out.println(entrySet);*/

        /*for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            System.out.printf("%s\t->\t%s%n", entry.getKey(), entry.getValue());
        }*/

        employeeMap.forEach((key, value) -> System.out.printf("%s\t->\t%s%n", key, value));

        Map<Integer, String> testMap = Map.of(
                12, "A",
                47, "B",
                7, "C"
        );

        Map<Integer, String> testMap2 = Map.ofEntries(
                Map.entry(12, "A"),
                Map.entry(47, "B"),
                Map.entry(7, "C")
        );

//        testMap.put(5, "f");
    }

    private static Integer ex3(String romanNum) {

        Map<Character, Integer> romanToDecimalMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        StringBuilder romanNumSB = new StringBuilder(romanNum.trim()).reverse();
        int decimalNum = 0;
        int prevNum = -1;

        for (Character romanChar : romanNumSB.toString().toCharArray()) {
            int currentNum = romanToDecimalMap.get(romanChar);
            if (currentNum < prevNum) {
                currentNum *= -1;
            }
            decimalNum += currentNum;
            prevNum = currentNum;
        }
        return decimalNum;
    }
}
