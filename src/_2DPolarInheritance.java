//dziedziczenie po klasie Vector2D
class _2DPolarInheritance extends Vector2D {
    public _2DPolarInheritance(double x, double y) {
        super(x, y);
    } // inincjowanie obiektu i przekazanie go do konstruktora Vector2D

    public double getAngle() {
        return Math.atan(super.getComponents().get(1) / super.getComponents().get(0));
    } // oblicza kat, kat ten obliczany jest ze wspolrzednych dostepnych w obiekcie klasy Vector2D
}
