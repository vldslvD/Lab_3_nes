import java.util.ArrayList;

public class ShapeController {
    private Rectangle rectModel;
    private Triangle triangleModel;
    private Circle circleModel;
    private View view;

    public ShapeController(Rectangle rectModel, Triangle triangleModel, Circle circleModel, View view){
        this.rectModel = rectModel;
        this.triangleModel = triangleModel;
        this.circleModel = circleModel;
        this.view = view;
    }

    public ShapeController() {
    }

    public void setSideA(int a){
        rectModel.setA(a);
    }
    public int getSideA(){
        return rectModel.getA();
    }
    public void setSideB(int b){
        rectModel.setB(b);
    }
    public int getSideB(){
        return rectModel.getB();
    }
    public double getRectSquare(){
        return rectModel.getSquare();
    }

    public void setSideA_tr(int a){
        triangleModel.setA(a);
    }
    public int getSideA_tr(){
        return triangleModel.getA();
    }
    public void setHeight(int height){
        triangleModel.setHeight(height);
    }
    public int getHeight(){
        return triangleModel.getHeight();
    }
    public double getTrSquare(){
        return triangleModel.getSquare();
    }

    public void setRadius(int radius){
        circleModel.setRadius(radius);
    }
    public int getRadius(){
        return circleModel.getRadius();
    }
    public double getCircleSquare(){
        return circleModel.getSquare();
    }

    public void updateView(){
        view.printRectangleDetails(rectModel.getA(), rectModel.getB(), rectModel.getSquare(), rectModel.getShapeColor());
        view.printTriangleDetails(triangleModel.getA(), triangleModel.getHeight(), triangleModel.getSquare(), triangleModel.getShapeColor());
        view.printCircleDetails(circleModel.getRadius(), circleModel.getSquare(), circleModel.getShapeColor());

    }

    public double total_area(ArrayList<Shape> list){
        double square_sum = 0;
        for(Shape item: list){
            square_sum += item.getSquare();
        }
        return square_sum;
    }

    public double totalAreaByType(ArrayList<Shape> list, String str){

        String temp = "";
        double square_sumOfType = 0;
        for(Shape item: list){
            if(item.getClass().toString().toLowerCase().contains(str)) {
                String [] tr2 = item.getClass().toString().trim().split(" ");
                temp = tr2[1];
                square_sumOfType += item.getSquare();
            }
        }
        return square_sumOfType;
    }

}
