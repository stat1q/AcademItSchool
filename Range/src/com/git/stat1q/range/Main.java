package com.git.stat1q.range;

import java.util.Arrays;

public class Main {

    public void printRange (){

    }

    public static void main(String[] args) {
        Range range = new Range(1.5, 9.9);
        Range secondRange = new Range(1, 10);

        System.out.println(range);

        System.out.println("Длина интервала = " + range.getRangeLength());
        System.out.println("Число входит в интервал?  " + range.isInside(5));
        System.out.println("Интервал-пересечения - " + range.getIntersectionRange(secondRange));
        System.out.println("Объединенный интервал - " + range.merge(secondRange));
        System.out.println("Разность интервалов - " + range.getRangeDiff(secondRange));

    }
}
