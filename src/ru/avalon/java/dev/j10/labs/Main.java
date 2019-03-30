package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[10];

        shapes[0] = new Circle(1.2);
        shapes[1] = new Triangle(1, 2, 2.5, 40);
        shapes[2] = new Circle(0.2);
        shapes[3] = new Rectangle(3.2, 1.5, 55);
        shapes[4] = new Circle(2.2);
        shapes[5] = new Triangle(2, 4, 5, 170);
        shapes[6] = new Rectangle(2.9, 4, 110);
        shapes[7] = new Circle(1.3);
        shapes[8] = new Triangle(4, 3, 2, 90);
        shapes[9] = new Rectangle(3, 4, 0);
        

        
        Shape maxArea = getMaxArea(shapes);
                

    }

    public static Shape getMaxArea(Shape array[]) {
        Shape max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].getArea() > max.getArea()){
                max = array[i];
                }
        }
        return max;

    }

}
/*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
 */
