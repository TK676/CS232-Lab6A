package lab6A;


public class Triangle extends Shape {

    public double base;
    public double height;
 
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }
 
    public void setBase(double base) {
        this.base = base;
    }
 
    public double getHeight() {
        return height;
    }
 
    public void setHeight(double height) {
        this.height = height;
    }
 
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    @Override
    public String toString() {
        return "/ " + area() + " \\";
    }
}