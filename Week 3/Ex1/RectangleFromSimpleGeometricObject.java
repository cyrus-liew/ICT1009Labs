public class RectangleFromSimpleGeometricObject extends GeometricObject {
    private double width, height;

    RectangleFromSimpleGeometricObject(){

    }

    RectangleFromSimpleGeometricObject(double width, double height){
        this.width = width;
        this.height= height;
    }

    RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return this.width + this.width + this.height + this.height;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }
}
