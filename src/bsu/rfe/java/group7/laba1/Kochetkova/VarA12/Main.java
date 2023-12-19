package bsu.rfe.java.group7.laba1.Kochetkova.VarA12;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Food> breakfast = new ArrayList<Food>();

        for (String el : args) {
            String[] params = el.split("/");

            switch (params[0]) {
                case ("Beef") -> breakfast.add(new Beef(params[1]));
                case ("Cake") -> breakfast.add(new Cake(params[1]));
                case ("Tea") -> breakfast.add(new Tea(params[1]));
            }
        }


    int counter = 0;
        for (Food el: breakfast){
            if (el.equals(breakfast.get(0))){
                counter++;
            }
        }
        System.out.println("There are " + counter + " " + breakfast.get(0));
        for (Food food : breakfast) {
            food.consume();
        }
    }
}
