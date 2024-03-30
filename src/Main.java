import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        _2DPolarInheritance vector2d = new _2DPolarInheritance(1, 2);
        Vector3DDecorator vector3ddecorator = new Vector3DDecorator(1, 2, 3);
        Vector3DInheritance vector3dinheritance = new Vector3DInheritance(1, 2, 3);

        System.out.println("UKŁAD KARTEZJANSKI:");
        System.out.println("Wektor 2d");
        System.out.println("x: " + vector2d.getComponents().get(0) + ", y: " + vector2d.getComponents().get(1));
        System.out.println("Wektor 3d inheritance");
        System.out.println("x: " + vector3dinheritance.getComponents().get(0) + ", y: " + vector3dinheritance.getComponents().get(1) + ", z: " + vector3dinheritance.getComponents().get(2));
        System.out.println("Wektor 3d decorator");
        System.out.println("x: " + vector3ddecorator.getComponents().get(0) + ", y: " + vector3ddecorator.getComponents().get(1) + ", z: " + vector3ddecorator.getComponents().get(2));

        System.out.println("\nUKŁAD BIEGUNOWY:");
        System.out.println("Wektor 2d");
        System.out.println("promien wodzacy: " + vector2d.abs());
        System.out.println("wartosc kata: " + vector2d.getAngle());

        System.out.println("\nILOCZYN WEKTOROWY");
        Vector3DDecorator tmp_vector3ddecorator = vector3ddecorator.cross(vector2d);
        System.out.println("Wektor 3d decorator i wektor 2d:");
        System.out.println("x: " + tmp_vector3ddecorator.getComponents().get(0));
        System.out.println("y: " + tmp_vector3ddecorator.getComponents().get(1));
        System.out.println("z: " + tmp_vector3ddecorator.getComponents().get(2));
        Vector3DInheritance tmp_vector3dinheritance = vector3dinheritance.cross(vector2d);
        System.out.println("Wektor 3d inheritance i wektor 2d:");
        System.out.println("x: " + tmp_vector3dinheritance.getComponents().get(0));
        System.out.println("y: " + tmp_vector3dinheritance.getComponents().get(1));
        System.out.println("z: " + tmp_vector3dinheritance.getComponents().get(2));

        System.out.println("\nILOCZYN SKALARNY");
        System.out.println("Wektor 2d z wektorem 2d: " + vector2d.cdot(vector2d));
        System.out.println("Wektor 3d inheritance z wektorem 2d: " + vector3dinheritance.cdot(vector2d));
        System.out.println("Wektor 3d decorator z wektorem 2d: " + vector3ddecorator.cdot(vector2d));
    }
}
