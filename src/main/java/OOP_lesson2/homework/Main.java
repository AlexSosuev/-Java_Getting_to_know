package OOP_lesson2.homework;

public class Main {
    public static void main(String[] args) {
        GameObject building = new Building(100,10);
        GameObject building1 = new Building(100,20);
        GameObject building2 = new Building(100,40);
        GameObject building3= new Building(100,60);
        GameObject building4 = new Building(100,80);

        GameObject hero = new Hero(200,110,100,35);
        GameObject neutral = new Neutral(200,180);

        Render render = new Render();
        render.showIndicator(building);
        render.showIndicator(building1);
        render.showIndicator(building2);
        render.showIndicator(building3);
        render.showIndicator(building4);

        render.showIndicator(hero);
        render.showIndicator(neutral);
    }
}
