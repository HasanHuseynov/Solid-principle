package l.good;

public class Rectangle implements Shape {

    private double width;
    private double height;
    @Override
    public double findArea() {
        return width*height;
    }
}
