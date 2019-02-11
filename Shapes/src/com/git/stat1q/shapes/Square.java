package com.git.stat1q.shapes;

public class Square extends Shapes{
    private double side;

    public Square (double side){
        this.side = side;
    }

    @Override
    public double getWidth(){
        return side;
    }

    @Override
    public double getHeight(){
        return side;
    }

    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public double getPerimeter(){
        return 4 * side;
    }

}
