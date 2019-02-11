package com.git.stat1q.main;

import com.git.stat1q.shapes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shapes[] shapesArray = {
                new Square(4),
                new Rectangle(5,8),
                new Triangle(0,0,2,3,9,6),
                new Circle(7),
                new Square(7),
                new Rectangle(4,6),
                new Triangle(0,0,4,3,5,4),
                new Circle(6)
        };
        System.out.println(getMaxArea(shapesArray));
        System.out.println(getMaxPerimeter(shapesArray));
    }

    private static Shapes getMaxArea(Shapes shapesArray[]) {
        Arrays.sort(shapesArray, new AreaComparator());
        return shapesArray[shapesArray.length - 1];
    }

    private static Shapes getMaxPerimeter(Shapes shapesArray[]) {
        Arrays.sort(shapesArray, new AreaComparator());
        return shapesArray[shapesArray.length - 2];
    }

}
