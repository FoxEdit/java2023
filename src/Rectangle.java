public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
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
