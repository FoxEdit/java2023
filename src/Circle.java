public class Circle extends Shape {
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimetr() {
        return 0;
    }

    public String toString() {
        return null;
    }
}
