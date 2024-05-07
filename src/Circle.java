public class Circle extends SimpleGeometricObject{
    private double radius;
    public Circle() {

    }
    public Circle(double radius) {
        this.radius=radius;
    }
    public Circle(double radius,String color, boolean filled) {
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double GetDiameter() {
        return 2*radius;
    }
    public double GetPerimeter() {
        return 2*radius*Math.PI;
    }
    public void printCircle() {
        System.out.println("Circle is created on " + GetDateCreated() + " and radius "+radius);
    }
}