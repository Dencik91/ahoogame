package org.dencik_incorporated;

public class App {
    public static void main(String[] args) {
        TV tv = new TV(100);
        Fridge fridge = new Fridge(300);

        tv.standBy();
        fridge.switchOn();

        System.out.println(tv);
        System.out.println(fridge);
    }
}
