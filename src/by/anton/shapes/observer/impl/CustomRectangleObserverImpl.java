package by.anton.shapes.observer.impl;

import by.anton.shapes.entity.CustomRectangle;
import by.anton.shapes.entity.CustomRectangleParameter;
import by.anton.shapes.exception.CustomRectangleException;
import by.anton.shapes.observer.CustomRectangleEvent;
import by.anton.shapes.observer.CustomRectangleObserver;
import by.anton.shapes.warehouse.CustomRectangleWarehouse;

public class CustomRectangleObserverImpl implements CustomRectangleObserver {
    @Override
    public void parameterChanged(CustomRectangleEvent event) throws CustomRectangleException {
        CustomRectangle rectangle = event.getSource();
        CustomRectangleParameter parameter = new CustomRectangleParameter(rectangle);
        parameter.countAllRectangleParameters();
        CustomRectangleWarehouse container = CustomRectangleWarehouse.getInstance();
        container.putCustomRectangleParameter(rectangle.getRectangleId(), parameter);
    }
}
