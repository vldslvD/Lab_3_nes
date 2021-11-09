public abstract class Shape implements Drawable {
    private String shapeColor;

    public Shape(){
        shapeColor = "white";
    }

    public String getShapeColor() {
        return shapeColor;
    }

    abstract double getSquare();

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    abstract double calcArea();

    @Override
    public String toString() {
        return "shapeColor='" + shapeColor + '\'';
    }
}
