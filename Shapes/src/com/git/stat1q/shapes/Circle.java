package com.git.stat1q.shapes;

public class Circle extends Shapes {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getWidth(){
        return radius * 2;
    }

    @Override
    public double getHeight(){
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
