package Circle;

public class Cylinder extends Circle{
    private double height = 2.1;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return  super.getRadius()*getRadius()*height*Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + "height = " + height;
    }
}
