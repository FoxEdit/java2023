public class Square extends Rectangle {
    protected double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double size) {
        width = size;
    }

    public void setLength(double size) {
        length = size;
    }

    public String toString() {
        return super.toString();
    }
}
