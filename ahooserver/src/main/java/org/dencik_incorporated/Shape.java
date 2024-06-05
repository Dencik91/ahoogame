package org.dencik_incorporated;

public abstract class Shape implements HasCoordinates{
    private Coordinate coordinate;

    public Shape() {}

    public Shape(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "coordinate=" + coordinate +
                '}';
    }
}
