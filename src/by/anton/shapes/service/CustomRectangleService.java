package by.anton.shapes.service;

public class CustomRectangleService {
    public static double countRectanglePerimeter(double width, double length) {
        double perimeter = 2 * (width + length);
        return perimeter;
    }

    public static double countRectangleSquare(double width, double length) {
        double square = width * length;
        return square;
    }

    public static double createRectangleWidth(double pointOne, double pointTwo){
        double result = Math.abs(pointOne - pointTwo);
        return result;
    }
    public static double createRectangleLength(double pointOne, double pointTwo){
        double result = Math.abs(pointOne  - pointTwo);
        return result;
    }
}
