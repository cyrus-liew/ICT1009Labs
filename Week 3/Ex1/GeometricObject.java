public class GeometricObject {
    String color;
    boolean filled;

    GeometricObject(){
        this.color = "white";
    }

    GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

}
