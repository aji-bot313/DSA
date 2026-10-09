public class Driver {
    public static void main(String[] args) {

        shape shape1 = new shape("Red");
        shape square1 = new Square("Yellow", 5.0);
        shape circle1 = new circle(4.0, "Blue");
        shape cylinder1 = new cylinder(6.0, 4.0, "Green");

        shape1.printShape();
        square1.printShape();
        circle1.printShape();
        cylinder1.printShape();

        System.out.println("Volume of the cylinder: " + ((cylinder) cylinder1).CalculateVolume());
    }
}