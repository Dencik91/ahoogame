package org.dencik_incorporated;

public class TV implements HasPowerSaving{
    private int diagonal;
    private States isOn;

    public TV() {}

    public TV(int diagonal) {
        this.diagonal = diagonal;
        this.isOn = States.OFF;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "TV diagonal= " + diagonal + " is on "+ isOn;
    }

    public void switchOn() {
        this.isOn = States.ON;
    }

    public void switchOff() {
        this.isOn = States.OFF;
    }

    public void standBy() {
        this.isOn = States.Standby;
    }

    public boolean isOn() {
        return this.isOn != States.OFF;
    }
}

enum States { ON, OFF, Standby }
