package lesson5;

import java.util.*;

public class HomeWork {
    private static Map<String, List<String>> contacts = new HashMap<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите команду: ");
            String[] phoneBook = scanner.nextLine().split(" ");
            StringBuilder sb = new StringBuilder();
            if (phoneBook.length>2){
                for (int i = 2; i < phoneBook.length; i++) {
                    sb.append(phoneBook[i]);
                }
            }
            String command = phoneBook[0].toUpperCase();

            if (command.equals("ADD")) {
                String name = phoneBook[1];
                String number = sb.toString();
                addContact(name, number);
            } else if (command.equals("GET")) {
                String name = phoneBook[1];
                System.out.println(getContacts(name));

            } else if (command.equals("REMOVE")) {
                String name = phoneBook[1];
                removeContacts(name);
            } else if (command.equals("LIST")) {
                list();
            } else if (command.equals("EXIT")) {
                break;
            } else {
                System.out.println("Неверная команда.");
            }
        }
        scanner.close();
    }

    private static void addContact(String name, String number) {
        if (contacts.containsKey(name)) {
            contacts.get(name).add(number);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            contacts.put(name, numbers);
        }
    }

    public static List<String> getContacts(String firstName) {
        if (contacts.containsKey(firstName)) {
            return contacts.get(firstName);
        } else {
            System.out.println("Не найдена запись с фамилией " + firstName);
        }
        return null;
    }

    public static void removeContacts(String firstName) {
        if (contacts.containsKey(firstName)) {
            contacts.remove(firstName);
        } else {
            System.out.println("Не найдена запись с фамилией " + firstName);
        }
    }

    public static void list() {
        if (contacts.isEmpty()) {
            System.out.println("Список контактов - пуст.");
        } else {
            for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + " = " + getContacts(entry.getKey()));
            }
        }
    }
}