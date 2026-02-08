public class Cylinder extends Shape {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    // Formula for surface area of a Cylinder (2πr(h + r))
    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Formula for volume of a Cylinder (πr²h)
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public String toString(){
        return String.format("Cylinder:\nRadius: %.2f, Height: %.2f\nSurface Area: %.2f\nVolume: %.2f\n",
                radius, height, surface_area(), volume());
    }
}
