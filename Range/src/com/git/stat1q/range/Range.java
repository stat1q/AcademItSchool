package com.git.stat1q.range;

class Range {
    private double from;
    private double to;

    Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    double getRangeLength() {
        return to - from;
    }

    double getFrom() {
        return from;
    }

    double getTo() {
        return to;
    }

 /*   void setFrom(double from) {
        this.from = from;
    }

    void setTo(double to) {
        this.to = to;
    }*/

    boolean isInside(double number) {
        return number >= from && number <= to;
    }

    Range getIntersectionRange(Range secondRange) {
        if (from >= secondRange.to || secondRange.from >= to) {
            return null;
        } else {
            return new Range(Math.max(from, secondRange.from), Math.min(to, secondRange.to));
        }
    }

    Range[] merge(Range secondRange) {
        if (from > secondRange.to || secondRange.from > to) {
            return new Range[]{new Range(from, to), new Range(secondRange.from, secondRange.to)};
        } else {
            return new Range[]{new Range(Math.max(to, secondRange.to), Math.min(from, secondRange.from))};
        }
    }

    Range[] getRangeDiff(Range secondRange) {
        if (secondRange.from <= to && secondRange.to >= to) {
            return new Range[]{new Range(from, secondRange.from)};
        } else if (secondRange.to >= from && secondRange.from < to) {
            return new Range[]{new Range(secondRange.to, to)};
        } else if (secondRange.from <= from && secondRange.to >= to) {
            return new Range[0];
        } else if (secondRange.from > from && secondRange.to < to) {
            return new Range[]{new Range(from, secondRange.from), new Range(secondRange.to, to)};
        } else {
            return new Range[]{new Range(from, to)};
        }
    }
}