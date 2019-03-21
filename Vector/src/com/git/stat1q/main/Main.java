package com.git.stat1q.main;

import com.git.stat1q.vector.Vector;

public class Main {
    public static void main(String[] args) {
        int vectorSize = 5;
        double[] array = {-5, 8, 4, 77, 4};
        Vector vector = new Vector(array);
        Vector vector1 = new Vector(vectorSize);
        double[] array1 = {1, 22, 3, 4, 21, 9};
        Vector vector2 = new Vector(array1);
        Vector vector3 = new Vector(10, array1);
        Vector vector4 = new Vector(vector2);

        System.out.printf("Вектор с нулевыми компонентами: %s%n", vector1);
        System.out.printf("Вектор заполненный значениями из массива: %s%n", vector2);
        System.out.printf("Вектор заполненный значениями из массива: %s%n", vector3);
        System.out.printf("Копирование вектора: %s%n", vector4);
        System.out.printf("Сумма векторов: %s%n", vector.getSum(vector2));
        System.out.printf("Разность векторов: %s%n", vector.getDiff(vector2));

        double scalar = 3.2;

        System.out.printf("Умножение на скаляр: %s%n", vector.scalarMultiplication(scalar));
        System.out.printf("Разворот вектора: %s%n", vector.reverse());

        int indexComponent = 3;
        double component = 55;

        System.out.printf("Комнпонента под индексом №%d = %.1f%n", indexComponent, vector.getComponent(indexComponent));

        vector.setComponent(indexComponent, component);
        System.out.printf("Заменена компонента под индексом №%d на компоненту %.1f   %s%n", indexComponent, component, vector);
        System.out.println("Равны ливектора? %" + vector.equals(vector2));
        System.out.printf("Сумма векторов(static): %s%n", Vector.getSum(vector, vector2));
        System.out.printf("Разность векторов(static): %s%n", Vector.getDiff(vector, vector2));
        System.out.printf("Скалярное произведение векторов(static): %.1f%n", Vector.scalarVectorsMultiplication(vector, vector2));
        System.out.printf("Длинна вектора = %.2f", vector.getLength());
    }
}
