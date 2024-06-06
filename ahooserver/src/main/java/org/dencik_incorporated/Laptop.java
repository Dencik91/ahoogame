package org.dencik_incorporated;

public class Laptop implements HasPowerSaving {
    private int numberCores;
    private States isOn;
//    private final byte ON=1;
//    private final byte OFF=0;
//    private final byte STANDBY=2;
//    private final byte DIMMED=3;

    public Laptop() {}

    public Laptop(int numberCores) {
        this.numberCores = numberCores;
        this.isOn = States.OFF;
    }

    public int getNumberCores() {
        return numberCores;
    }

    public void setNumberCores(int numberCores) {
        this.numberCores = numberCores;
    }

    @Override
    public String toString() {
        return "Laptop numberCores= " + numberCores + ", isOn=" + isOn;
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

    public void dimmed() {
        this.isOn = States.Dimmed;
    }

    public boolean isOn() {
        return this.isOn != States.OFF;
    }

    enum States { ON, OFF, Standby, Dimmed }
}
