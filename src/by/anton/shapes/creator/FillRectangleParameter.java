package by.anton.shapes.creator;

import by.anton.shapes.entity.CustomRectangle;
import by.anton.shapes.entity.CustomRectangleParameter;
import by.anton.shapes.exception.CustomRectangleException;

class FillRectangleParameter {
     public static  CustomRectangleParameter fillRectangleParameter(CustomRectangle rectangle)
             throws CustomRectangleException {
         CustomRectangleParameter customRectangleParameter = new CustomRectangleParameter(rectangle);
         customRectangleParameter.countAllRectangleParameters();
         return customRectangleParameter;
     }
}
