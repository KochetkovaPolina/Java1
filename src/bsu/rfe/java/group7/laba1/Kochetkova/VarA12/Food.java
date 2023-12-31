package bsu.rfe.java.group7.laba1.Kochetkova.VarA12;

import java.util.Objects;

public abstract class Food implements Consumable{
    protected String name = "";


    Food(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return name.equals(food.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
