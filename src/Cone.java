public class Cone extends Shape{
    private final double radius;
    private final double height;

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    // Formula for surface area of a Cone (πr(l + r))
    // Slant Height (l) = √(r²+h²)
    @Override
    double surface_area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    // Formula for volume of Cone (1/3πr²h)
    @Override
    double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public String toString() {
        return String.format("Cone:\nRadius: %.2f, Height: %.2f\nSurface Area: %.2f\nVolume: %.2f\n",
                radius, height, surface_area(), volume());
    }
}
