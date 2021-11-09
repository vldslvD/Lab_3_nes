import java.util.Comparator;

public class ColorComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape str1, Shape str2) {
        String str1Color = str1.getShapeColor();
        String str2Color = str2.getShapeColor();

        return str1Color.compareTo(str2Color);
    }
}
