package lesson6;

import java.util.Objects;

public class Cats {
    private String name;
    private String color;
    private String species;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(name, cats.name) && Objects.equals(color, cats.color) && Objects.equals(species, cats.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, species);
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


}
