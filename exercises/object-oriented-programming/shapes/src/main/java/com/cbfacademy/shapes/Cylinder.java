package com.cbfacademy.shapes;

public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder(String name, double radius, double height) {

        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * Math.PI * Math.pow(radius, 2);
    }

}
