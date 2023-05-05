package org.example;

import org.example.boats.BoatType;
import org.example.engines.inboardEngine;

public class Director {
    public void constructResqueBoat(Builder builder) {
        //construct Resque Boat
        builder.setBoatType(BoatType.RESQUE_BOAT);
        builder.setEngine(new inboardEngine());
        builder.setGPS(true);
        builder.setNavigationSystem(true);
        builder.setResqueEquipment(true);
        builder.setSeats(15);
    }

    public void constructFishingBoat(Builder builder) {
        //construct Fishing Boat
        builder.setBoatType(BoatType.FISHING_BOAT);
        builder.setEngine(new inboardEngine());
        builder.setGPS(false);
        builder.setNavigationSystem(false);
        builder.setResqueEquipment(false);
        builder.setSeats(2);
    }

    public void constructYacht(Builder builder) {
        //construct Yacht
        builder.setBoatType(BoatType.YACHT);
        builder.setGPS(true);
        builder.setNavigationSystem(false);
        builder.setResqueEquipment(true);
        builder.setSeats(6);

    }
}
