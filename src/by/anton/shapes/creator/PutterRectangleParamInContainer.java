package by.anton.shapes.creator;

import by.anton.shapes.entity.CustomRectangleParameter;
import by.anton.shapes.exception.CustomRectangleException;
import by.anton.shapes.warehouse.CustomRectangleWarehouse;

class PutterRectangleParamInContainer {
    public static void putRectangleParameterInContainer(CustomRectangleParameter parameter)
            throws CustomRectangleException {
        if(parameter == null) {
            throw new CustomRectangleException();
        }
        CustomRectangleWarehouse.getInstance().putCustomRectangleParameter(parameter.getId(), parameter);
    }
}
