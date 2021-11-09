public class Triangle extends Shape {
    private int a;
    private int height;
    private double square;

    public Triangle(int a, int height,String color) {
        this.a = a;
        this.height = height;
        calcArea();
        this.setShapeColor(color);
    }
    public Triangle(int a, int height) {
        this.a = a;
        this.height = height;
        calcArea();

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
    @Override
    double calcArea() {
        this.square = this.height*a*0.5;
        return this.square;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "square = " + square + " color - " + getShapeColor();
    }

    @Override
    public void draw() {
        System.out.println("▲");
    }
}
