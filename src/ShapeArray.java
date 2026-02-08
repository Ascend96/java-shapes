// Driver class
public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate one of each shape
        Shape sphere = new Sphere(5.0);
        Shape cylinder = new Cylinder(3.0, 7.0);
        Shape cone = new Cone(2.0, 6.0);

        // Store in an array
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through array and print info
        for (Shape shape : shapeArray) {
            System.out.println(shape);
        }
    }
}
