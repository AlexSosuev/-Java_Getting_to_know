package OOP_lesson4.models;

public class Student extends User{
    public Student(String fullName, Integer age, String phoneNumber) {
        super( fullName, age, phoneNumber);
    }

    @Override
    public String toString() {
        return String.format("Студент имеет следующие свойства: id: %s, name %s, age %s, phone number %s", getId(),
                getFullName(), getAge(), getPhoneNumber());
    }
}
