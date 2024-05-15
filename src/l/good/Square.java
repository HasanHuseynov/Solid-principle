package l.good;

public class Square implements Shape {
    private double width;

    @Override
    public double findArea() {
        return width*width;
    }
}
