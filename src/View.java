import java.util.ArrayList;
import java.util.Scanner;

public class View {
    ShapeController contr = new ShapeController();
    public void printRectangleDetails(int a, int b, double square, String shapeColor){
        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Square: " + square);
        System.out.println("Color: " + shapeColor);
    }
    public void printTriangleDetails(int a, int height, double square, String shapeColor){
        System.out.println("Side a: " + a);
        System.out.println("Height: " + height);
        System.out.println("Square: " + square);
        System.out.println("Color: " + shapeColor);
    }
    public void printCircleDetails(int radius, double square, String shapeColor){
        System.out.println("Radius: " + radius);
        System.out.println("Square: " + square);
        System.out.println("Color: " + shapeColor);
    }
    public void printTotalArea(ArrayList<Shape> list){
        System.out.println("total area is " + contr.total_area(list));
    }

    public void printTotalAreaByType(ArrayList<Shape> list){
        System.out.println("Enter the type of shape: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String temp = "";
        for(Shape item: list){
            if(item.getClass().toString().toLowerCase().contains(str.toLowerCase())) {
                String [] tr2 = item.getClass().toString().trim().split(" ");
                temp = tr2[1];
            }
        }
        System.out.println("total area of " + temp + "s is " + contr.totalAreaByType(list, str));
    }

    public void printAll(ArrayList<Shape> list){
        for(Shape item: list){
            System.out.println(item.toString());
        }
    }
}
