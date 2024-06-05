package org.dencik_incorporated;

public class TV implements HasPowerSaving{
    private int diagonal;
    private byte isOn;
    private final byte ON=1;
    private final byte OFF=0;
    private final byte STANDBY=2;


    public TV() {}

    public TV(int diagonal) {
        this.diagonal = diagonal;
        this.isOn = OFF;
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
        this.isOn = ON;
    }

    public void switchOff() {
        this.isOn = OFF;
    }

    public void standBy() {
        this.isOn = STANDBY;
    }

    public boolean getIsOn() {
        return this.isOn > OFF;
    }
}
