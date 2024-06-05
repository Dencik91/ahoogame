package org.dencik_incorporated;

public class Circle extends Shape{
    private byte radius;

    public Circle() {}

    public Circle(byte radius) {
        this.radius = radius;
    }

    public Circle(Coordinate coordinate, byte radius) {
        super(coordinate);
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(new Coordinate(x, y));
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = (byte) radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
