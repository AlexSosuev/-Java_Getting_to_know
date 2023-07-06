package lesson3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        StudentGroup group = new StudentGroup();
        group.addStudent(new Student(4L, "Ivan Morozov"));
        group.addStudent(new Student(6L, "Petr Vorobev"));
        group.addStudent(new Student(2L, "Sidor        Sidorov"));
        group.addStudent(new Student(1L, "Elena Ivanova"));
        group.addStudent(new Student(8L, "Anna Morozova"));

        var students = group.getStudents();

//        students.sort(new StudentComparator());
//        students.sort(Comparator.reverseOrder());
        students.sort((o1, o2) -> {
            String familyName1 = o1.getName().split("\\s+")[1];
            String familyName2 = o2.getName().split("\\s+")[1];

            return familyName1.compareTo(familyName2);
        });
        System.out.println(students);



/*        for (Student student : group) {
            System.out.println(student);
        }*/

/*        Iterator<Student> iterator = group.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.printf("%s\t%s%n", student.getId(), student.getName());
            if (student.getName().equals("Petr Vorobev")) {
                iterator.remove();
            }
        }*/

        group.forEach(student -> System.out.printf("%s\t%s%n", student.getId(), student.getName()));


        String groupInfo = String.valueOf(group);
    }
}
