package lesson6;

public class Laptop {
    private String brand;
    private double screenSize;
    private int ram;
    private int storageSize;
    private double price;
    private String processor;

    public Laptop(String brand, String processor, double screenSize, int ram, int storageSize, double price) {
        this.brand = brand;
        this.processor = processor;
        this.screenSize = screenSize;
        this.ram = ram;
        this.storageSize = storageSize;
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ноутбук {" + "бренд = '" + brand + '\'' + ", процессор = " + processor +
                ", размер экрана = " + screenSize + ", оперативная память = " + ram +
                " Гб, размер HDD (SSD) = " + storageSize + " Гб, цена = " + price + " руб.}";
    }
}
