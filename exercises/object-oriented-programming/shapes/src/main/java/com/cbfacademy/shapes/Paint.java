package com.cbfacademy.shapes;

public class Paint {

    private double covarage; // (sqft/gallon)

    public Paint(double covarage) {
        this.covarage = covarage;
    }

    public double getAmount(Shape shape) {
        double area = shape.getArea(); //collects specific shape area(sqft)
        return area / covarage; // returns gallons of paint
    }

}
