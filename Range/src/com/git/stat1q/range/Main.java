package com.git.stat1q.range;

class Main {
    public static void main(String[] args) {
        Range firstRange = new Range(1.5, 99.9);
        Range secondRange = new Range(100, 101);

        System.out.println("Длина интервала = " + firstRange.getRangeLength());
        System.out.println("Число входит в интервал?  " + firstRange.isInside(5));

        Range intersection = firstRange.getIntersectionRange(secondRange);
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
        for (Range e : firstRange.getRangeDiff(secondRange)) {
            System.out.println(e.getFrom() + " ... " + e.getTo());
        }
    }
}