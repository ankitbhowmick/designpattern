package FactoryPattern;

/**
 * @author ankitbhowmick@hotmail.com
 * 25/8/18
 */
public class FactoryPatternClient {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(Shapes.CIRCLE);
        circle.draw();

        Shape rectangle = shapeFactory.getShape(Shapes.RECTANGLE);
        rectangle.draw();

        Shape square = shapeFactory.getShape(Shapes.SQUARE);
        square.draw();
    }
}
