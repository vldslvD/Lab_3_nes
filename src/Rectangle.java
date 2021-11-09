public class Rectangle extends Shape {
    private int a;
    private int b;
    private double square;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        calcArea();
    }
    public Rectangle(int a, int b, String color) {
        this.a = a;
        this.b = b;
        calcArea();
        this.setShapeColor(color);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    double calcArea() {
        this.square = this.a*this.b;
        return this.square;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "square = " + square + " color - " + getShapeColor();
    }

    @Override
    public void draw() {
        System.out.println("▇▇▇");
    }
}
