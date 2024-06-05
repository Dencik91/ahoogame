package org.dencik_incorporated;

public class Window implements HasCoordinates{
    private Coordinate coordinate;

    public Window() {}

    public Window(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Window(int x, int y) {
        this.coordinate = new Coordinate(x, y);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int x, int y) {
        this.coordinate = new Coordinate(x, y);
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
