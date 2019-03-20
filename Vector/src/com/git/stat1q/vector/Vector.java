package com.git.stat1q.vector;

import java.util.Arrays;

public class Vector {
    private double[] components;

    public Vector(int n) {
        if (n <= 0) throw new IllegalArgumentException("Размер вектора должен быть больше нуля");
        components = new double[n];
        for (int i = 0; i < n; i++) {
            components[i] = 0;
        }
    }

    public Vector(Vector vector) {
        components = Arrays.copyOf(vector.components, vector.getSize());
    }

    public Vector(double[] array) {
        if (array == null) {
            throw new NullPointerException("Массив пустой");
        } else {
            components = Arrays.copyOf(array, array.length);
        }
    }

    public Vector(int n, double[] array) {
        if (n <= 0) {
            throw new IllegalArgumentException("Размер вектора должен быть больше нуля");
        } else {
            components = new double[n];
            if (array == null) {
                throw new NullPointerException("Массив пустой");
            } else
                components = Arrays.copyOf(array, n);
        }
    }

    private int getSize() {
        return components.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        for (double component : components) {
            sb.append(component);
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(" }");
        return sb.toString();
    }

    public Vector getSum(Vector vector) {
        if (this.components.length < vector.components.length) {
            this.components = Arrays.copyOf(this.components, vector.components.length);
        }
        for (int i = 0; i < vector.components.length; ++i) {
            this.components[i] += vector.components[i];
        }
        return this;
    }

    public Vector getDiff(Vector vector) {
        if (this.components.length < vector.components.length) {
            this.components = Arrays.copyOf(this.components, vector.components.length);
        }
        for (int i = 0; i < vector.components.length; ++i) {
            this.components[i] -= vector.components[i];
        }
        return this;
    }

    public Vector multiplicationScalar(double scalar) {
        for (int i = 0; i < getSize(); ++i) {
            components[i] = scalar * components[i];
        }
        return this;
    }

    public Vector reverseVector() {
        double reverse = -1;
        return this.multiplicationScalar(reverse);
    }

    public void setComponent(int i, double component) {
        if (i < 0 || i >= getSize()) {
            throw new IndexOutOfBoundsException("Индекс компопнеты выходит за границы вектора.");
        } else {
            this.components[i] = component;
        }
    }

    public double getComponent(int i) {
        if (i < 0 || i >= getSize()) {
            throw new IndexOutOfBoundsException("Индекс компопнеты выходит за границы вектора.");
        } else {
            return this.components[i];
        }
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash;
        for (double component : components) {
            hash += Double.hashCode(component);
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vector vector = (Vector) obj;
        return Arrays.equals(components, vector.components);
    }

    public static Vector getSum(Vector vector, Vector vector1) {
        Vector newVector = new Vector(vector);
        return newVector.getSum(vector1);
    }

    public static Vector getDiff(Vector vector, Vector vector1) {
        Vector newVector = new Vector(vector);
        return newVector.getDiff(vector1);
    }

    public static double multiplicationVector(Vector vector, Vector vector1) {
        double result = 0;
        int n = Math.min(vector.getSize(), vector1.getSize());

        for (int i = 0; i < n; ++i) {
            result += (vector.getComponent(i) * vector1.getComponent(i));
        }
        return result;
    }

    public double getLength() {
        double sum = 0;

        for (double component : components) {
            sum += Math.pow(component, 2);
        }
        return Math.sqrt(sum);
    }
}
