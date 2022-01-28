import java.lang.Math;

public class CircleFromSimpleGeometricObject extends GeometricObject {
    private double radius;

    CircleFromSimpleGeometricObject(){

    }

    CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }

    CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public double getDiameter(){
        return 2 * this.radius;
    }
}
