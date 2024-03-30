//rozszerzenie klasy Vector2D w odróżnieniu od Vector3DDecorator ta klasa dziedziczy po klasie Vector2D rowniez dodaje trzecia wspolrzedna
import java.util.ArrayList;
import java.util.List;

class Vector3DInheritance extends Vector2D {
    private double z;

    public Vector3DInheritance(double x, double y, double z) { //konstruktor (inicjuje obiekt)
        super(x, y);
        this.z = z;
    }

    public double abs() { // oblicza dlugosc trojwymiarowego wektora
        List<Double> srcComponents = super.getComponents();
        return Math.sqrt(srcComponents.get(0) * srcComponents.get(0) + srcComponents.get(1) * srcComponents.get(1) + z * z);
    }

    public double cdot(IVector param) { //oblicza iloczyn skalarny miedzy podanym wektorem a wektorem ktory jest przekazany jako param
        List<Double> srcComponents = super.getComponents();
        List<Double> paramComponents = param.getComponents();
        return srcComponents.get(0) * paramComponents.get(0) + srcComponents.get(1) * paramComponents.get(1) + z * 0;
    }

    public List<Double> getComponents() { //zwraca liste kompenentow
        List<Double> srcComponents = super.getComponents();
        List<Double> components = new ArrayList<>();
        components.add(srcComponents.get(0));
        components.add(srcComponents.get(1));
        components.add(z);
        return components;
    }

    public Vector3DInheritance cross(IVector param) { //oblicza iloczyn wektorowy
        List<Double> paramComponents = param.getComponents();
        double crossX = super.getComponents().get(1) * 0 - z * paramComponents.get(1);
        double crossY = super.getComponents().get(0) * 0 - z * paramComponents.get(0);
        double crossZ = super.getComponents().get(0) * paramComponents.get(1) - super.getComponents().get(1) * paramComponents.get(0);
        return new Vector3DInheritance(crossX, crossY, crossZ);
    }

    public Vector2D getSrcV() {
        return this;
    } // zwarac obecny obiekt Vector3DInheritance jako trójwymiarowy wektor
}
