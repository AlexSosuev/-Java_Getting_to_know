package OOP_lesson4;

import OOP_lesson4.controllers.GroupController;
import OOP_lesson4.controllers.StudentController;
import OOP_lesson4.controllers.TeacherController;
import OOP_lesson4.repositories.StudentRepository;
import OOP_lesson4.repositories.TeacherRepository;
import OOP_lesson4.services.GroupService;
import OOP_lesson4.services.StudentService;
import OOP_lesson4.services.TeacherService;
import OOP_lesson4.view.GroupView;
import OOP_lesson4.view.SortType;
import OOP_lesson4.view.StudentView;
import OOP_lesson4.view.TeacherView;

public class Main {

    private static StudentService studentService;
    private static TeacherService teacherService;

    public static void main(String[] args) {
        StudentView viewStudent = getStudentController();
        TeacherView viewTeacher = getTeacherController();
        GroupView groupView = getGroupView();
//      -------------------------------------------------------------------------------------------
        viewTeacher.create("Ivan Ivanovich Ivanov", 55, "0984", "11Б");
        viewTeacher.create("Nikolay Sergeevich Pupkin", 44, "024321", "11А");
        viewTeacher.create("Petr Petrovich Holiday", 66, "03543", "10А");

        viewStudent.create("Ivan Morozov", 18, "02", "11Б");
        viewStudent.create("Ivan Morozov", 18, "02", "11Б");
        viewStudent.create("Petr Vorobev", 19, "03", "10А");
        viewStudent.create("Sidor Sidorov", 20, "112", "10А");
        viewStudent.create("Elena Ivanova", 19, "911", "10А");
        viewStudent.create("Anna Morozova", 17, "01", "11А");
//      ---------------------------------------------------------------------------------------------

        UniversityApp universityApp = new UniversityApp(viewStudent, viewTeacher, groupView);
//        viewTeacher.sendOnConsole(SortType.AGE);
//        groupView.printAllFromGroup("10А");
//        viewStudent.sendOnConsole();
//        viewStudent.sendOnConsole(SortType.NAME);
//        viewStudent.sendOnConsole(SortType.ID);
//        viewStudent.removeUser("Ivan Morozov");
//        viewStudent.sendOnConsole();
    }

    private static StudentView getStudentController() {
        StudentRepository studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        StudentController studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }
    private static TeacherView getTeacherController() {
        TeacherRepository teacherRepository = new TeacherRepository();
        teacherService = new TeacherService(teacherRepository);
        TeacherController teacherController = new TeacherController(teacherService);
        return new TeacherView(teacherController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService,teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }
}