package by.anton.shapes.entity;

import by.anton.shapes.exception.CustomRectangleException;
import by.anton.shapes.service.CustomRectangleService;

public class CustomRectangleParameter {
    private CustomRectangle customRectangle;
    private long id;
    private double perimeter;
    private double square;
    private double rectangleWidth;
    private double rectangleLength;


    public CustomRectangleParameter(CustomRectangle customRectangle) throws CustomRectangleException {
        if(customRectangle == null) {
            throw  new CustomRectangleException();
        }
        this.customRectangle = customRectangle;
        this.id = customRectangle.getRectangleId();
    }
    private void countRectangleWidth(){
        rectangleWidth =
                CustomRectangleService.createRectangleWidth(customRectangle.getCustomPointB().getCoordinateY(),
                        customRectangle.getCustomPointA().getCoordinateY());
    }

    private void countRectangleLength(){
         rectangleLength =
                CustomRectangleService.createRectangleLength(customRectangle.getCustomPointD().getCoordinateX(),
                        customRectangle.getCustomPointA().getCoordinateX());
    }

    public void countAllRectangleParameters(){
        countRectangleLength();
        countRectangleWidth();
        perimeter = CustomRectangleService.countRectanglePerimeter(rectangleWidth, rectangleLength);
        square = CustomRectangleService.countRectangleSquare(rectangleWidth, rectangleLength);
    }

    public long getId() {
        return id;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomRectangleParameter{");
        sb.append(customRectangle.toString());
        sb.append("id = ").append(id);
        sb.append(", perimeter = ").append(perimeter);
        sb.append(", square = ").append(square);
        sb.append('}');
        return sb.toString();
    }
}
