package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Huawei", "AMD Ryzen 7 5700U 1.8 ГГц", 15.6, 16, 512, 59990));
        laptops.add(new Laptop("HIPER", "Intel Core i5 10400 2.9ГГц", 16.1, 32, 512, 138990));
        laptops.add(new Laptop("Digma", "Intel Core i5 10210U 1.6ГГц", 15.6, 8, 512, 39990));
        laptops.add(new Laptop("ASUS", "Intel Core i7 1065G7 1.3ГГц", 15.6, 16, 512, 57990));
        laptops.add(new Laptop("CHUWI", "Intel Core i3 10110U 2.1ГГц", 14.14, 8, 512, 37990));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальный размер оперативной памяти: ");
        int minSize = scanner.nextInt();

        for (Laptop laptop : laptops) {
            if (laptop.getRam() >= minSize) {
                System.out.println(laptop);
            }
        }
        scanner.close();
    }
}
