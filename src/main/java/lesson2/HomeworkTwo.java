package lesson2;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class HomeworkTwo {
    public static void main(String[] args) throws IOException, ParseException {
        oneTask();
        twoTask();

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
    private static void twoTask() {

    }
}