package org.example.boats;

import org.example.boats.BoatType;
import org.example.engines.Engine;

public class Boat {
    private final int seats;
    private final Engine engine;

    private final BoatType boatType;

    private final boolean navigationSystem;
    private final boolean GPS;
    private final boolean resqueEquipment;
    private float fuel = 0;

    public Boat(int seats, Engine engine, BoatType boatType, boolean navigationSystem, boolean GPS, boolean resqueEquipment) {
        this.seats = seats;
        this.engine = engine;
        this.boatType = boatType;
        this.navigationSystem = navigationSystem;
        this.GPS = GPS;
        this.resqueEquipment = resqueEquipment;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public BoatType getBoatType() {
        return boatType;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    public boolean isGPS() {
        return GPS;
    }

    public boolean isResqueEquipment() {
        return resqueEquipment;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel += fuel;
    }
}
