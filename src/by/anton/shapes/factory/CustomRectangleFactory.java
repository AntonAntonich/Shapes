package by.anton.shapes.factory;

import by.anton.shapes.entity.CustomPoint;
import by.anton.shapes.entity.CustomRectangle;
import by.anton.shapes.exception.CustomRectangleException;
import by.anton.shapes.validator.ContainsNullValidator;

public class CustomRectangleFactory {
    public static final int POINT_A_X_COORDINATE = 0;
    public static final int POINT_A_Y_COORDINATE = 1;
    public static final int POINT_B_X_COORDINATE = 2;
    public static final int POINT_B_Y_COORDINATE = 3;
    public static final int POINT_C_X_COORDINATE = 4;
    public static final int POINT_C_Y_COORDINATE = 5;
    public static final int POINT_D_X_COORDINATE = 6;
    public static final int POINT_D_Y_COORDINATE = 7;

    public static CustomRectangle createCustomRectangle(Double [] points) throws CustomRectangleException {
        if(ContainsNullValidator.isContainNull(points)){
            throw  new CustomRectangleException();
        }
        CustomPoint customPointA = new CustomPoint(points[POINT_A_X_COORDINATE], points[POINT_A_Y_COORDINATE]);
        CustomPoint customPointB = new CustomPoint(points[POINT_B_X_COORDINATE], points[POINT_B_Y_COORDINATE]);
        CustomPoint customPointC = new CustomPoint(points[POINT_C_X_COORDINATE], points[POINT_C_Y_COORDINATE]);
        CustomPoint customPointD = new CustomPoint(points[POINT_D_X_COORDINATE], points[POINT_D_Y_COORDINATE]);
        CustomRectangle customRectangle =
                new CustomRectangle(
                        customPointA,
                        customPointB,
                        customPointC,
                        customPointD
                        );

        return customRectangle;
    }


}
