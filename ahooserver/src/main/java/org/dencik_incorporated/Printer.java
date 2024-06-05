package org.dencik_incorporated;

public class Printer<T> {
    public boolean test(T t) {
        return t.toString().startsWith("J");
    }
}
