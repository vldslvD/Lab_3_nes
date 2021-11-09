import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        ShapeComparator shapeComparator = new ShapeComparator();
        ColorComparator colorComparator = new ColorComparator();
        ArrayList<Shape> list = retrieveShapeFromList();
        System.out.println("List at the beginning:");
        view.printAll(list);
        view.printTotalArea(list);
        view.printTotalAreaByType(list);
        System.out.println("\nSorting by square");
        list.sort(shapeComparator);
        view.printAll(list);
        System.out.println("\nSorting by color");
        list.sort(colorComparator);
        view.printAll(list);

}

    private static ArrayList<Shape> retrieveShapeFromList(){
        ArrayList<Shape> list = new ArrayList<>();
        Rectangle rect = new Rectangle(2,4);
        Rectangle rect2 = new Rectangle(8,2);
        Rectangle rect3 = new Rectangle(1,7, "blue");
        Circle circle = new Circle(3, "pink");
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle(5, "red");
        Circle circle4 = new Circle(6, "magenta");
        Triangle tr = new Triangle(1, 3, "yellow");
        Triangle tr2 = new Triangle(2,4, "brown");
        Triangle tr3 = new Triangle(3,5, "black");
        Triangle tr4 = new Triangle(4,6);




        //Color color = new Color(0xF0877A);
        list.add(rect);
        list.add(rect2);
        list.add(rect3);
        list.add(circle);
        list.add(circle2);
        list.add(circle3);
        list.add(circle4);
        list.add(tr);
        list.add(tr2);
        list.add(tr3);
        list.add(tr4);
        return list;
    }
}
