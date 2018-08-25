package AbstractFactoryPattern;

/**
 * @author ankitbhowmick@hotmail.com
 * 25/8/18
 */
public class ShapeFactory implements AbstractFactory {

    @SuppressWarnings("Duplicates")
    public Shape getShape(Shapes shapeType) {
        if (shapeType.equals(Shapes.CIRCLE))
            return new Circle();
        else if (shapeType.equals(Shapes.RECTANGLE))
            return new Rectangle();
        else if (shapeType.equals(Shapes.SQUARE))
            return new Square();

        else
            return null;

    }

    public Color getfill(Colors colors) {
        return null;
    }
}
