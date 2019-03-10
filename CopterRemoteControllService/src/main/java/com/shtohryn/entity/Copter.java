package com.shtohryn.entity;

public class Copter {
    private int coordinateX;
    private int coordinateY;
    private int coordinateZ;
    private int limit;

    public Copter() {
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = this.coordinateX >= 100 ? coordinateX : 100;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = getCoordinateX() >= limit ? coordinateY : limit;
    }

    public int getCoordinateZ() {
        return coordinateZ;
    }

    public void setCoordinateZ(int coordinateZ) {
        this.coordinateZ = getCoordinateZ() >= 100 ? coordinateZ : 100;
    }

    public Copter(int coordinateX, int coordinateY, int coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.limit = 100;
    }

    @Override
    public String toString() {
        return "Copter coordinates{" +
                "X=" + coordinateX +
                ", Y=" + coordinateY +
                ", Z=" + coordinateZ +
                '}';
    }
}
