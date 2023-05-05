package org.example.engines;

import org.example.engines.Engine;

public class inboardEngine implements Engine {
    private int power = 50;

    @Override
    public void setTurbo(int hp) {
        this.power += hp;
    }

    @Override
    public void getPower() {
        System.out.println("Power :" + power);
    }
}
