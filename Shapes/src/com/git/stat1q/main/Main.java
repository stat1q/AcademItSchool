package com.git.stat1q.main;

import com.git.stat1q.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(20),
                new Rectangle(5, 8),
                new Triangle(0, 0, 10, 9, 20, 30),
                new Circle(7),
                new Square(7),
                new Rectangle(4, 6),
                new Triangle(0, 0, 4, 3, 5, 4),
                new Circle(6)
        };
        System.out.println("Фигура с максимальной площадью - это " + getMaxAreaShape(shapes));
        System.out.print("Фигура со вторым по величине периметром - это " + getSecondMaxPerimeterShape(shapes));
    }

    private static Shape getMaxAreaShape(Shape[] shapes) {
        Arrays.sort(shapes, new AreaComparator());
        return shapes[shapes.length - 1];
    }

    private static Shape getSecondMaxPerimeterShape(Shape[] shapes) {
        Arrays.sort(shapes, new PerimeterComparator());
        return shapes[shapes.length - 2];
    }
}
