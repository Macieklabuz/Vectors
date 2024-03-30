//dekorator dla klasy Vector2d ktory rozszerza wektor dwuwymiarowy do 3 wymiarow. dziedziczy po Vector2D
import java.util.ArrayList;
import java.util.List;

class Vector3DDecorator extends Vector2D {
    private Vector2D srcVector;
    private double z;

    public Vector3DDecorator(double x, double y, double z) { // konstruktor (tworzy obiekt)
        super(x, y);
        this.srcVector = new Vector2D(x, y);
        this.z = z;
    }

    public double abs() { // oblicza dlugos 3 wymiarowego wektora
        List<Double> srcComponents = srcVector.getComponents();
        return Math.sqrt(srcComponents.get(0) * srcComponents.get(0) + srcComponents.get(1) * srcComponents.get(1) + z * z);
    }

    public double cdot(IVector param) { // oblicza iloczyn skalarny
        List<Double> srcComponents = super.getComponents();
        List<Double> paramComponents = param.getComponents();
        return srcComponents.get(0) * paramComponents.get(0) + srcComponents.get(1) * paramComponents.get(1) + z * 0;
    }

    public List<Double> getComponents() { // zwraca liste komponentow
        List<Double> srcComponents = srcVector.getComponents();
        List<Double> components = new ArrayList<>();
        components.add(srcComponents.get(0));
        components.add(srcComponents.get(1));
        components.add(z);
        return components;
    }

    public Vector3DDecorator cross(IVector param) { //oblicza iloczyn wektorowy
        List<Double> paramComponents = param.getComponents();
        double crossX = srcVector.getComponents().get(1) * 0 - z * paramComponents.get(1);
        double crossY = srcVector.getComponents().get(0) * 0 - z * paramComponents.get(0);
        double crossZ = srcVector.getComponents().get(0) * paramComponents.get(1) - srcVector.getComponents().get(1) * paramComponents.get(0);
        return new Vector3DDecorator(crossX, crossY, crossZ);
    }

    public Vector2D getSrcV() {
        return srcVector;
    } //zwraca orginalny dwuwymiarowy wektor
}
