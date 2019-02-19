package com.git.stat1q.shapes;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return String.format("квадрат со стороной %.1f, площадью = %.2f, периметром = %.2f.", side, getArea(), getPerimeter());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Square square = (Square) o;
        return square.side == side;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        return Double.hashCode(prime * hash + (int) side);
    }
}
