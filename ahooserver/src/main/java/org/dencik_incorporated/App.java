package org.dencik_incorporated;

public class App {
    public static void main(String[] args) {
        TV tv = new TV(100);
        Fridge fridge = new Fridge(300);
        Laptop laptop = new Laptop(16);

        tv.standBy();
        fridge.switchOn();
        laptop.dimmed();

        System.out.println(tv);
        System.out.println(fridge);
        System.out.println(laptop);
    }
}
