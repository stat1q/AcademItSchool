package com.git.stat1q.main;

import com.git.stat1q.shapes.Shapes;

import java.util.Comparator;

public class AreaComparator implements Comparator<Shapes> {

    @Override
    public int compare(Shapes firstShape, Shapes secondShape) {
        return Double.compare(firstShape.getArea(), secondShape.getArea());
    }
}
