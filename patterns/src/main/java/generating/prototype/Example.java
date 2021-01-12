package generating.prototype;

import generating.prototype.shapes.Circle;
import generating.prototype.shapes.Rectangle;
import generating.prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 *  Прототип (Prototype)
 *  Позволяет копировать объекты, не вдаваясь в подробности их реализации.
 *  Клонирование совершается самим объектом-прототипом, что позволяет ему скопировать значения всех полей, даже приватных.
 *  Паттерн Прототип реализован в базовой библиотеке Java посредством интерфейса Cloneable.
 */
public class Example {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);
        shapes.add(circle.clone());

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);
        shapes.add(rectangle.clone());

        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.print(i + ": Shapes are different objects");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(" and they are identical");
                } else {
                    System.out.println(" but they are not identical");
                }
            } else {
                System.out.println(i + ": Shape objects are the same");
            }
        }
    }

}