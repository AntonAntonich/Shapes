package by.anton.shapes.observer;

import by.anton.shapes.exception.CustomReaderException;
import by.anton.shapes.exception.CustomRectangleException;


public interface CustomRectangleObserver {
    void parameterChanged(CustomRectangleEvent event) throws CustomRectangleException;
}
