package AbstractFactoryPattern;

/**
 * @author ankitbhowmick@hotmail.com
 * 25/8/18 5:46 PM
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();

        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}