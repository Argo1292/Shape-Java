public class Pyramid implements ShapeNew {
    private double base;
    private double slant;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSlant() {
        return slant;
    }

    public void setSlant(double slant) {
        this.slant = slant;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double totalSurfaceArea() {
        return 2*base*slant + Math.pow(base,2);
    }

    @Override
    public double volume() {
        return (1/3)*Math.pow(base,2)*height;
    }
}
