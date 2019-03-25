package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая фигура,
 * образованная тремя отрезками, которые соединяют три точки, не лежащие на
 * одной прямой. Указанные три точки называются вершинами треугольника, а
 * отрезки — сторонами треугольника. Часть плоскости, ограниченная сторонами,
 * называется внутренностью треугольника: нередко треугольник рассматривается
 * вместе со своей внутренностью (например, для определения понятия площади).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Shape, Polygon {
    
    private double a;
    private double b;
    private double c;
    
    private int rotation;

    public Triangle(double a, double b, double c, int r) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.rotation = r;
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        return  Math.sqrt (p * (p - a) * (p - b) * (p - c));
    }

    public int getRotation() {
        return rotation;
    }

    public double getPerimeter() {
        return a + b + c;
    }
}
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
