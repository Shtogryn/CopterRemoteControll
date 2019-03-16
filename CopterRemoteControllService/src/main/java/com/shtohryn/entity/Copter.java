package com.shtohryn.entity;

public class Copter {
    private int coordinateX;
    private int coordinateY;
    private int coordinateZ;
    private final int LIMIT=100;

    public Copter() {
    }

    public Copter(int coordinateX, int coordinateY, int coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = this.coordinateX >= 90 ? LIMIT : coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }


    public void setCoordinateY(int coordinateY) {
        this.coordinateY = this.coordinateY >= 90 ? LIMIT : coordinateY;
    }

    public int getCoordinateZ() {
        return coordinateZ;
    }

    public void setCoordinateZ(int coordinateZ) {
        this.coordinateZ = this.coordinateZ >= 90 ? LIMIT : coordinateZ;
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
