import vol.Cylinder;

public class cylinderVolume {
    public static void main(String[] args) {
        double radius = 3.5;
        double height = 7.2;

        Cylinder cylinder = new Cylinder(radius, height);
        double volume = cylinder.volume();

        System.out.println("Volume of the cylinder: " + volume);
    }
}
