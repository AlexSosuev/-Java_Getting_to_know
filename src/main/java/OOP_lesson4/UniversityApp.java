package OOP_lesson4;

import OOP_lesson4.view.GroupView;
import OOP_lesson4.view.StudentView;
import OOP_lesson4.view.TeacherView;

import java.util.Scanner;

public class UniversityApp {

    public UniversityApp(StudentView viewStudent, TeacherView viewTeacher, GroupView groupView) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("EXIT")) {
                break;
            }

            String[] parts = command.split(" ");
            String action = parts[0];

            switch (action) {
                case "/get-student" -> viewStudent.sendOnConsole();
                case "/get-teacher" -> viewTeacher.sendOnConsole();
                case "/get-group" -> groupView.printAllFromGroup(parts[1]);
                case "/create-student" -> viewStudent.create(parts[1].replaceAll("_",  " "), Integer.parseInt(parts[2]), parts[3], parts[4]);
                case "/create-teacher" -> viewTeacher.create(parts[1].replaceAll("_", " "), Integer.parseInt(parts[2]), parts[3], parts[4]);
                case "/delete-student" -> viewStudent.removeUser(parts[1].replaceAll("_", " "));
                case "/delete-teacher" -> viewTeacher.removeUser(parts[1].replaceAll("_", " "));
            }
        }
        scanner.close();
    }
}