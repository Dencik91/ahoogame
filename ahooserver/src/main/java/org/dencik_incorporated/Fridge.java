package org.dencik_incorporated;

public class Fridge implements Switchable {
    private int volume;
    private boolean isOn;

    public Fridge() {}

    public Fridge(int volume) {
        this.volume = volume;
        this.isOn = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Fridge volume= " + volume +  " is on "+ isOn;
    }

    public void switchOn() {
        this.isOn = true;
    }

    public void switchOff() {
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
