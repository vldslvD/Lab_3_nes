public class Circle extends Shape {
    private int radius;
    private double square;

    public Circle(int radius) {
        this.radius = radius;
        calcArea();
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        calcArea();
        this.setShapeColor(color);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
    @Override
    double calcArea() {
        this.square = this.radius*Math.PI;
        return this.square;
    }

    @Override
    public String toString() {
        return "Circle: " + "radius = " + radius +
                ", square =  " + square + " color - " + getShapeColor();
    }

    @Override
    public void draw() {
        System.out.println("●");
    }
}
