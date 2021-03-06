package com.git.stat1q.main;

import com.git.stat1q.range.Range;

public class Main {
    public static void main(String[] args) {
        Range firstRange = new Range(5, 20);
        Range secondRange = new Range(1, 22);

        System.out.println("Длина интервала = " + firstRange.getLength());
        System.out.println("Число входит в интервал?  " + firstRange.isInside(5));

        Range intersection = firstRange.getIntersection(secondRange);
        if (intersection == null) {
            System.out.println("Пересечения нет.");
        } else {
            System.out.println("Интервал-пересечения - " + intersection.getFrom() + " ... " + intersection.getTo());
        }

        System.out.print("Объединенный интервал - ");
        for (Range e : firstRange.merge(secondRange)) {
            System.out.println(e.getFrom() + " ... " + e.getTo());
        }

        System.out.print("Разность интервалов - ");
        for (Range e : firstRange.getDiff(secondRange)) {
            System.out.println(e.getFrom() + " ... " + e.getTo());
        }
    }
}
