public class Square implements Shape {
    private double side;


    public double getSide() {
        return side;
    }

    public void setSide(double length) {
        this.side = length;
    }


    @Override
    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
