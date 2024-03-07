import java.util.Scanner;

public class UserInput {
    public void Circle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius in cm --> ");
        double radius = scan.nextDouble();

        Circle circle = new Circle();
        circle.setRadius(radius);

        System.out.println("Area of Circle is " + circle.area());
        System.out.println("Perimeter of Circle is " + circle.perimeter());
    }

    public void Sphere(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius in cm --> ");
        double radius = scan.nextDouble();

        Sphere sphere = new Sphere();
        sphere.setRadius(radius);

        System.out.println("Total Surface Area of Sphere is " + sphere.totalSurfaceArea());
        System.out.println("Cross-sectional Surface Area of Sphere is " + sphere.cross_sectionalSurfaceArea());
        System.out.println("Cross-sectional Surface Area of Sphere is " + sphere.curvedSurfaceArea());
        System.out.println("Volume of Sphere is " + sphere.volume());
    }

    public void Square(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Side in cm --> ");
        double side = scan.nextDouble();

        Square square = new Square();
        square.setSide(side);

        System.out.println("Area of Square is " + square.area());
        System.out.println("Perimeter of Square is " + square.perimeter());
    }

    public void Rectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length in cm --> \n");
        double length = scan.nextDouble();
        System.out.println("Enter Breadth in cm --> \n");
        double breadth = scan.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(length);
        rectangle.setBreadth(breadth);

        System.out.println("Area of Rectangle is " + rectangle.area());
        System.out.println("Perimeter of Rectangle is " + rectangle.perimeter());
    }

    public void Cylinder(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius in cm --> ");
        double radius = scan.nextDouble();
        System.out.println("Enter Height in cm --> \n");
        double height = scan.nextDouble();


        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(radius);

        System.out.println("Total Surface Area of Cylinder is " + cylinder.totalSurfaceArea());
        System.out.println("Cross-sectional Surface Area of Cylinder is " + cylinder.cross_sectionalSurfaceArea());
        System.out.println("Cross-sectional Surface Area of Cylinder is " + cylinder.curvedSurfaceArea());
        System.out.println("Volume of Cylinder is " + cylinder.volume());
    }

    public void Pyramid(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Base length in cm --> ");
        double base = scan.nextDouble();
        System.out.println("Enter Height in cm --> \n");
        double height = scan.nextDouble();
        System.out.println("Enter Slant Height in cm --> \n");
        double slant = scan.nextDouble();


        Pyramid pyramid = new Pyramid();
        pyramid.setBase(base);
        pyramid.setSlant(slant);
        pyramid.setHeight(height);

        System.out.println("Total Surface Area of Pyramid is " + pyramid.totalSurfaceArea());
        System.out.println("Volume of Pyramid is " + pyramid.volume());
    }
}
