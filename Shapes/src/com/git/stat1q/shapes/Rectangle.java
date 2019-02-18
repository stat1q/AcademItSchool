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

    @Override
    public String toString() {
        return String.format("прямоугольник с высотой %.1f, шириной %.1f, площадью = %.2f, периметром = %.2f.", height, width, getArea(), getPerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return rectangle.height == height && rectangle.width == width;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int hash = 1;
        hash = PRIME * hash + (int) height;
        hash = PRIME * hash + (int) width;
        return hash;
    }
}