package exceptionLesson3.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные (Фамилия Имя Отчество датарождения номертелефона пол):");
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");

            if (data.length != 6)
                throw new IncompleteDataException(data);

            String surName = data[0];
            String name = data[1];
            String firstName = data[2];

            String birthDate = data[3];
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            try {
                dateFormatter.parse(birthDate);
            } catch (RuntimeException e) {
                throw new IncorrectDateOfBirthException();
            }

            String phoneNumber = data[4];
            try {
                Long.parseLong(phoneNumber);
            } catch (NumberFormatException e) {
                throw new NotPhoneNumberException();
            }
            if (phoneNumber.length() < 11) {
                throw new NotPhoneNumberFormatException();
            }

            String gender = data[5];
            if (!gender.equals("f") && !gender.equals("m"))
                throw new IncorrectGenderValueException();


            String fileContent = surName + " " + name + " " + firstName + " " +
                    birthDate + " " + phoneNumber + " " + gender;

            try (FileWriter fileWriter = new FileWriter("src/main/java/exceptionLesson3/homework/" + surName + ".txt", true)) {
                fileWriter.write(fileContent + "\n");
            } catch (IOException e) {
                System.out.println("Произошла ошибка чтения-записи в файле.");
                e.printStackTrace();
            }
            System.out.println("Данные успешно записаны в файл.");
        }
    }
}