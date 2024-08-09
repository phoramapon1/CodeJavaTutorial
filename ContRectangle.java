public class ContRectangle {
    private double length;
    private double width;
    public ContRectangle(double len, double w){
        length = len;
        width = w;
    }
    public ContRectangle(){
        length = 1.0;
        width = 1.0;
    }
    public double getlength(){
        return length;
    }
    public double getwidth(){
        return width;
    }
    public double getArea(){
        return length * width;
    }
}
