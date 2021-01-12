package structure.composite;

import structure.composite.editor.ImageEditor;
import structure.composite.shapes.Circle;
import structure.composite.shapes.CompoundShape;
import structure.composite.shapes.Dot;
import structure.composite.shapes.Rectangle;

import java.awt.*;

/**
 *  Компоновщик (Composite)
 *  Позволяет сгруппировать объекты в древовидную структуру, а затем работать с ними так, как будто это единичный объект.
 *  Этот пример показывает как можно работать со сложными геометрическими фигурами, составленными из простых так, как будто они сами являются простыми.
 */
public class Example {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                new Rectangle(50, 50, 50, 10, Color.BLUE),
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),
                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Circle(250, 250, 50, Color.RED),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }

}