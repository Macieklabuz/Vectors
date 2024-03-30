//reprezentujr dwuwymiarowy wektor
import java.util.ArrayList;
import java.util.List;

class Vector2D implements IVector {
    private double x;
    private double y;

    public Vector2D(double x, double y) { // inicjuje obiekt vector2d
        this.x = x;
        this.y = y;
    }

    public List<Double> getComponents() { //zwarca liste komponentow wektora
        List<Double> components = new ArrayList<>();
        components.add(x);
        components.add(y);
        return components;
    }

    public double abs() {
        return Math.sqrt(x * x + y * y);
    } // oblicza dlugosc wektora

    public double cdot(IVector param) { // oblicza iloczyn skalarny
        List<Double> paramComponents = param.getComponents();
        return x * paramComponents.get(0) + y * paramComponents.get(1);
    }
}
