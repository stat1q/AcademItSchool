package com.git.stat1q.shapes;

public class Rectangle extends Shapes{
    private double width;
    private double height;

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getWidth(){
        return width;
    }

    @Override
    public double getHeight(){
        return height;
    }

    @Override
    public double getArea(){
        return width*height;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
