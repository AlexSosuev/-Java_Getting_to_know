package OOP_lesson4;

import OOP_lesson4.controllers.StudentController;
import OOP_lesson4.repositories.StudentRepository;
import OOP_lesson4.services.StudentService;

public class Main {

    public static void main(String[] args) {
        StudentController controller = getStudentController();
//        -------------------------------------------------------------------------

        controller.create("Ivan Morozov", 18, "02");
        controller.create("Petr Vorobev", 19, "03");
        controller.create("Sidor Sidorov", 20, "112");
        controller.create("Elena Ivanova", 19, "911");
        controller.create("Anna Morozova", 17, "01");

        System.out.println(controller.getAll());

        controller.remove("Ivan Morozov");

        System.out.println(controller.getAll());

    }

    private static StudentController getStudentController() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);

        return controller;
    }
}
