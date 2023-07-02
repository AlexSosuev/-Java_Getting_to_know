package OOP_lesson2.homework;

public class Render {
    public void showIndicator(Object object) {
        if (object instanceof Health) {
            System.out.println("Текущее здоровье = " + ((Health) object).getCurrentHealth());
            String colorHeaith = color(((Health) object).getCurrentHealth()*100/((Health) object).getMaxHealth());
            for (int i = 10; i <= ((Health) object).getMaxHealth(); i += 10) {
                if (i <= ((Health) object).getCurrentHealth()) {
                    System.out.print(colorHeaith);
                } else {
                    System.out.print("\u001B[37mX");
                }
            }
            System.out.println("\u001B[0m");

        }
        if (object instanceof Mana) {
            System.out.println("Текущее количество маны = " + ((Mana) object).getCurrentMana());
            String colorMana = color(((Mana) object).getCurrentMana()*100/((Mana) object).getMaxMana());
            for (int i = 10; i <= ((Mana) object).getMaxMana(); i += 10) {
                if (i <= ((Mana) object).getCurrentMana()) {
                    System.out.print(colorMana);
                } else {
                    System.out.print("\u001B[37mX");
                }
            }
            System.out.println("\u001B[0m");
        }
    }

    private String color(int temp){
        if (temp>=0 && temp<=10) {
            return "\u001B[30mX";
        }
        if (temp>10 && temp<=25) {
            return "\u001B[31mX";
        }
        if (temp>25 && temp<=50) {
            return "\u001B[33mX";
        }
        if (temp>50 && temp<=75) {
            return "\u001B[35mX";
        }
        return "\u001B[32mX";
    }
}