package com.cbfacademy.shapes;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double getArea();

    public String getName() {
        return name;
    };
}
