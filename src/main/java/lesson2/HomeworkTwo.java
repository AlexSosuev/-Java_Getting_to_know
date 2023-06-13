package lesson2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class HomeworkTwo {
    public static void main(String[] args) throws IOException, ParseException {
//        oneTask();
//        twoTask();
        treeTask();
    }

    //Задание 1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя
// StringBuilder. Данные для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен
// попадать в запрос. Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    private static void oneTask() throws IOException, ParseException {
        Object jsonObject = new JSONParser().parse(new FileReader("src/main/java/lesson2/file.json"));
        StringBuilder sb = new StringBuilder("SELECT * FROM students WHERE ");
        JSONObject infoJson = (JSONObject) jsonObject;

        String name = (String) infoJson.get("name");
        String country = (String) infoJson.get("country");
        String city = (String) infoJson.get("city");
        String age = (String) infoJson.get("age");

        int count = 0;
        if (!name.equals("null")) {
            sb.append("name = '").append(name);
            count++;
        }

        if (!country.equals("null") && count != 0) {
            sb.append("' AND ").append("country = '").append(country);
            count++;
        } else if (!country.equals("null")) {
            sb.append("country = '").append(country);
            count++;
        }

        if (!city.equals("null") && count != 0) {
            sb.append("' AND ").append("city = '").append(city);
            count++;
        } else if (!city.equals("null")) {
            sb.append("city = '").append(city);
            count++;
        }
        if (!age.equals("null") && count != 0) {
            sb.append("' AND ").append("age = '").append(age);
            count++;
        } else if (!age.equals("null")) {
            sb.append("country = '").append(age);
            count++;
        }
        if (count == 0) {
            System.out.println("Все данные равны null");
        } else {
            System.out.println("Итоговый запрос выглядит так: \n" + sb + "'");
        }
    }


    //Задание 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в
// лог-файл.
    private static void twoTask() throws IOException {
        int[] arr = createArray();
        String path = "src/main/java/lesson2/log_HW_2.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                writer.write(Arrays.toString(arr) + "\n");
            }
        }
        writer.flush();
        writer.close();
    }

    private static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(arr) + "\n");
        return arr;
    }


    //Дана json-строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}] Написать метод(ы), который распарсит json и, используя
// StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.
    private static void treeTask() {
        JSONParser parser = new JSONParser();
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("src/main/java/lesson2/file_HW_3.json")) {
            JSONArray persons = (JSONArray) parser.parse(reader);
            for (Object obj : persons) {
                sb.append("Студент ").append(((JSONObject) obj).get("фамилия"))
                        .append(" получил ").append(((JSONObject) obj).get("оценка"))
                        .append(" по предмету ").append(((JSONObject) obj).get("предмет")).append("\n");
            }
        } catch (Exception e) {
            System.out.println("Parsing error " + e);
        }
        System.out.println(sb);
    }
}