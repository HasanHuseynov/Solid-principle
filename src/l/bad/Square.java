package l.bad;

public  class Square  extends Rectangle{
    @Override
    public double findArea() {
        return super.width*super.height;
    }
}
