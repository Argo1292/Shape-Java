public class Cylinder implements Shape3D {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double totalSurfaceArea() {
        return 2*Math.PI*(radius*(height+radius));
    }

    @Override
    public double cross_sectionalSurfaceArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double curvedSurfaceArea() {
        return 2*Math.PI*radius*height;
    }

    @Override
    public double volume() {
        return 2*Math.PI*Math.pow(radius,2)*height;
    }
}
