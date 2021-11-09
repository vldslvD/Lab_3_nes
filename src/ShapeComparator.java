import java.util.*;

public class ShapeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if(o1.getSquare()<o2.getSquare())
            return -1;
        else if(o1.getSquare()>o2.getSquare())
            return 1;
        return 0;

    }
}
