package OOP_lesson2;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
//        first();
        second();
    }

    private static void second() {
        Fish fish = new Fish();
        Shark shark = new Shark();
        Dolphin dolphin = new Dolphin();

        Swimming[] swimmings = {fish, shark, dolphin};

        for (Swimming swimming : swimmings) {
/*            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            swimming.swim();
            swimming.sayHello();
        }


        Swimming.staticMethod();

    }

    public static void swimingAnimal(Swimming swimming) {
        swimming.swim();
    }

    private static void first() {
        UserService service1 = UserService.getInstance();
        service1.setName("11111111111");
        System.out.println(service1.getName());

        UserService service2 = UserService.getInstance();
        service1.setName("222222222222");
        System.out.println(service1.getName());
        System.out.println(service2.getName());

        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
    }
}
