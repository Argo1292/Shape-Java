public class Sphere implements Shape3D{
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double totalSurfaceArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double cross_sectionalSurfaceArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double curvedSurfaceArea() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double volume() {
        return ((double) 4 /3)*Math.PI*Math.pow(radius,4);
    }
}
