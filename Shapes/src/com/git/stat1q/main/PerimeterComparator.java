package com.git.stat1q.main;

import com.git.stat1q.shapes.Shape;

import java.util.Comparator;

    public class PerimeterComparator implements Comparator<Shape> {
        @Override
        public int compare(Shape Shape1, Shape Shape2) {
            return Double.compare(Shape1.getPerimeter(), Shape2.getPerimeter());
        }
    }