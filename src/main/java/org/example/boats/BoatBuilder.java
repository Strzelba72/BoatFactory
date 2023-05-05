package org.example.boats;

import org.example.Builder;
import org.example.engines.Engine;

public class BoatBuilder implements Builder {
    private int seats;
    private Engine engine;

    private BoatType boatType;

    private boolean navigationSystem;
    private boolean GPS;
    private boolean resqueEquipment;

    public BoatBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.seats = 0;
        this.engine = null;
        this.boatType = null;
        this.navigationSystem = false;
        this.GPS = false;
        this.resqueEquipment = false;
    }

    @Override
    public void setBoatType(BoatType type) {
        this.boatType = type;
    }

    @Override
    public void setSeats(int number) {
        this.seats = number;
    }

    @Override
    public void setEngine(Engine type) {
        this.engine = type;
    }

    @Override
    public void setNavigationSystem(boolean var) {
        this.navigationSystem = var;
    }

    @Override
    public void setGPS(boolean var) {
        this.GPS = var;
    }

    @Override
    public void setResqueEquipment(boolean var) {
        this.resqueEquipment = var;
    }

    public Boat getResult() {
        return new Boat(seats, engine, boatType, navigationSystem, GPS, resqueEquipment);
    }
}
