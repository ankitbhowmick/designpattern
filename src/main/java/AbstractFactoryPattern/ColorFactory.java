package AbstractFactoryPattern;

/**
 * @author ankitbhowmick@hotmail.com
 * 25/8/18 5:30 PM
 */
public class ColorFactory implements AbstractFactory {


    public Shape getShape(Shapes shapes) {
        return null;
    }

    public Color getfill(Colors colorType) {
        if (colorType.equals(Colors.RED))
            return new Red();
        else if (colorType.equals(Colors.BLUE))
            return new Blue();
        else if (colorType.equals(Colors.GREEN))
            return new Green();

        else
            return null;

    }
}
