package FactoryPattern;

/**
 * @author ankitbhowmick@hotmail.com
 * 25/8/18
 */
public class ShapeFactory {

    public Shape getShape(Shapes shapes) {
        if (shapes.equals(Shapes.CIRCLE))
            return new Circle();
        else if (shapes.equals(Shapes.RECTANGLE))
            return new Rectangle();
        else if (shapes.equals(Shapes.SQUARE))
            return new Square();

        else
            return null;

    }
}
