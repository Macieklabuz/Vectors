import java.util.List;

interface IVector {
    double abs();

    double cdot(IVector other);

    List<Double> getComponents();
}
