package com.git.stat1q.main;

import com.git.stat1q.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shapes[] shapes = {
                new Square(20),
                new Rectangle(5, 8),
                new Triangle(0, 0, 2, 3, 9, 6),
                new Circle(7),
                new Square(7),
                new Rectangle(4, 6),
                new Triangle(0, 0, 4, 3, 5, 4),
                new Circle(6)
        };
        System.out.println("Фигура с максимальной площадью - это " + getMaxArea(shapes));
        System.out.print("Фигура со вторым по величине периметром - это " + getSecondMaxPerimeter(shapes));
    }

    private static Shapes getMaxArea(Shapes []shapes) {
        Arrays.sort(shapes, new AreaComparator());
        return shapes[shapes.length - 1];
    }

    private static Shapes getSecondMaxPerimeter(Shapes []shapes) {
        Arrays.sort(shapes, new AreaComparator());
        return shapes[shapes.length - 2];
    }
}
