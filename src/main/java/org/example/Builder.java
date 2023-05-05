package org.example;

import org.example.boats.BoatType;
import org.example.engines.Engine;

public interface Builder {
    void reset();

    void setBoatType(BoatType type);

    void setSeats(int number);

    void setEngine(Engine type);

    void setNavigationSystem(boolean var);

    void setGPS(boolean var);

    void setResqueEquipment(boolean var);


}
