package com.git.stat1q.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public boolean isInside(double number) {
        return number >= from && number <= to;
    }

    public Range getIntersection(Range secondRange) {
        if (from >= secondRange.to || secondRange.from >= to) {
            return null;
        } else {
            return new Range(Math.max(from, secondRange.from), Math.min(to, secondRange.to));
        }
    }

    public Range[] merge(Range secondRange) {
        if (from > secondRange.to || secondRange.from > to) {
            return new Range[]{new Range(from, to), new Range(secondRange.from, secondRange.to)};
        } else {
            return new Range[]{new Range(Math.min(from, secondRange.from), Math.max(to, secondRange.to))};
        }
    }

    public Range[] getDiff(Range secondRange) {
        if (secondRange.from > to || secondRange.to < from || (secondRange.from <= from && secondRange.to >= to)) {
            return new Range[]{new Range(from, to)};
        } else if (secondRange.from >= from && secondRange.to > to) {
            return new Range[]{new Range(from, secondRange.from)};
        } else if (secondRange.from < from && secondRange.to <= to) {
            return new Range[]{new Range(secondRange.to, to)};
        } else {
            return new Range[]{new Range(from, secondRange.from), new Range(secondRange.to, to)};
        }
    }
}