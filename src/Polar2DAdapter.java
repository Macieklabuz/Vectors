// ta klasa sluzy jako adapter ktory przekształca obiekt klasy vector2D na obiekt ktory moze dzialac jako wektor iVector oraz reprezentacji polarnej IPolar2d
import java.util.List;

class Polar2DAdapter implements IPolar2D, IVector {
    private Vector2D srcVector;

    public Polar2DAdapter(Vector2D vector2D) {
        this.srcVector = vector2D;
    } //konstruktor

    public double abs() {
        return srcVector.abs();
    }// oblicza dlugosc wektora

    public double getAngle() {
        return Math.atan(srcVector.getComponents().get(1) / srcVector.getComponents().get(0));
    } // liczy kat

    public double cdot(IVector param) {
        return srcVector.cdot(param);
    } // oblicza iloczyn skalarny

    public List<Double> getComponents() {
        return srcVector.getComponents();
    } //deleguje wywolanie metody do obiektu srcVector i zwaraca wynik. ta metoda zwraca liste komponentow wektora
}
