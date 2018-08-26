package AbstractFactoryPattern;

/**
 * @author ankitbhowmick@hotmail.com
 * 26/8/18 8:25 AM
 */
public class AbstractFactoryPatternClient {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape circle = shapeFactory.getShape(Shapes.CIRCLE);

        circle.draw();

        Shape rectangle = shapeFactory.getShape(Shapes.RECTANGLE);

        rectangle.draw();

        Shape square = shapeFactory.getShape(Shapes.SQUARE);

        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getfill(Colors.RED);

        red.fill();

        Color blue = colorFactory.getfill(Colors.BLUE);

        blue.fill();

        Color green = colorFactory.getfill(Colors.GREEN);

        green.fill();
    }
}