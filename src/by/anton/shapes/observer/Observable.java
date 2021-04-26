package by.anton.shapes.observer;

import by.anton.shapes.exception.CustomRectangleException;

public interface Observable {
    void attach(CustomRectangleObserver customRectangleObserver) throws CustomRectangleException;
    void detach(CustomRectangleObserver customRectangleObserver) throws CustomRectangleException;
    void notifyObservers();

}
