public class Rectangle implements Shape {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length*breadth;
    }

    @Override
    public double perimeter() {
        return 2*(length + breadth);
    }
}
