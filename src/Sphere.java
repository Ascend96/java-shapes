public class Sphere extends Shape{

    private final double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    // Formula for surface are of a Sphere (4πr²)
    @Override
    public double surface_area() {
        return 4 * Math.PI * radius * radius;
    }

    // Formula for volume of a Sphere (4/3πr²)
    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }

    public String toString(){
        return String.format("Sphere:\nRadius: %.2f\nSurface Area: %.2f\nVolume: %.2f\n",
                radius, surface_area(), volume());
    }

}
