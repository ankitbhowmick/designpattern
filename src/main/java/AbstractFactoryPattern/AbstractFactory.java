package AbstractFactoryPattern;

/**
 * @author ankitbhowmick@hotmail.com
 * 25/8/18 5:28 PM
 */
public interface AbstractFactory {
    Shape getShape(Shapes shapes);

    Color getfill(Colors colors);
}
