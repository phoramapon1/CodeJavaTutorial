public class Rectangle {
    private double length;
    private double width;
    public void setLength(double len) {
        length = len;
    }
    public void setWidth(double w) {
        width = w;
    }
    public double setLength() {
        return length;
    }
    public double setWidth() {
        return width;
    }
    public double getArea() {
        return length * width;
    }
}
