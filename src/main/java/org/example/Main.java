package org.example;

import org.example.boats.Boat;
import org.example.boats.BoatBuilder;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //create a "director"
        Director director = new Director();
        //create class builder
        BoatBuilder builder = new BoatBuilder();
        //director constructs new boat
        director.constructYacht(builder);
        //return result
        Boat boat = builder.getResult();
        //display type of new created boat
        System.out.println(boat.getBoatType());

    }
}