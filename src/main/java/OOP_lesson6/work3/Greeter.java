package OOP_lesson6.work3;

public class Greeter {
    private String formality;

    public String greet(Formality formality) {
        return formality.greet();
    }
}