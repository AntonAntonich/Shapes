package by.anton.shapes.service;

import by.anton.shapes.entity.CustomRectangle;

public class CustomRectangleService {
    public static double countRectanglePerimeter(CustomRectangle customRectangle) {
        double perimeter = 2 * ((customRectangle.getRectangleWidth()) + (customRectangle.getRectangleLength()));
        return perimeter;
    }

    public static double countRectangleSquare(CustomRectangle customRectangle) {
        double square = customRectangle.getRectangleWidth() * customRectangle.getRectangleLength();
        return square;
    }
}
