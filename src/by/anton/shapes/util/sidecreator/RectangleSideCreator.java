package by.anton.shapes.util.sidecreator;

public class RectangleSideCreator {
    public static double createRectangleWidth(double pointOne, double pointTwo){
        double result = Math.abs(pointOne - pointTwo);
        return result;
    }
    public static double createRectangleLength(double pointOne, double pointTwo){
        double result = Math.abs(pointOne  -pointTwo);
        return result;
    }
}
