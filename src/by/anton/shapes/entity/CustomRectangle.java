package by.anton.shapes.entity;

import by.anton.shapes.exception.CustomRectangleException;
import by.anton.shapes.observer.CustomRectangleEvent;
import by.anton.shapes.observer.Observable;
import by.anton.shapes.observer.CustomRectangleObserver;

import java.util.ArrayList;
import java.util.List;

import static by.anton.shapes.util.sidecreator.RectangleSideCreator.*;
import static by.anton.shapes.util.idgenerator.RectangleIdGenerator.generateRectangleId;

public class CustomRectangle implements Observable {
    private List<CustomRectangleObserver> customRectangleObserverList = new ArrayList<>();
    private final long rectangleId;
    private CustomPoint customPointA;
    private CustomPoint customPointB;
    private CustomPoint customPointC;
    private CustomPoint customPointD;

    public CustomRectangle(){
        this.rectangleId = generateRectangleId();
    }

    public CustomRectangle(CustomPoint customPointA,
                           CustomPoint customPointB,
                           CustomPoint customPointC,
                           CustomPoint customPointD) {
        this();
        this.customPointA = customPointA;
        this.customPointB = customPointB;
        this.customPointC = customPointC;
        this.customPointD = customPointD;
    }

    public long getRectangleId() {
        return this.rectangleId;
    }

    public double getRectangleWidth(){
        double rectangleWidth =
                createRectangleWidth(customPointB.getCoordinateY(), customPointA.getCoordinateY());
        return rectangleWidth;
    }

    public double getRectangleLength(){
        double rectangleLength =
                createRectangleLength(customPointD.getCoordinateX(), customPointA.getCoordinateX());
        return rectangleLength;

    }

    public CustomPoint getCustomPointA() {
        return customPointA;
    }

    public void setCustomPointA(CustomPoint customPointA) {
        this.customPointA = customPointA;
        notifyObservers();
    }

    public CustomPoint getCustomPointB() {
        return customPointB;
    }

    public void setCustomPointB(CustomPoint customPointB) {
        this.customPointB = customPointB;
        notifyObservers();
    }

    public CustomPoint getCustomPointC() {
        return customPointC;
    }

    public void setCustomPointC(CustomPoint customPointC) {
        this.customPointC = customPointC;
    }

    public CustomPoint getCustomPointD() {
        return customPointD;
    }

    public void setCustomPointD(CustomPoint customPointD) {
        this.customPointD = customPointD;
        notifyObservers();
    }

    @Override
    public void attach(CustomRectangleObserver customRectangleObserver) throws CustomRectangleException {
        if(customRectangleObserver == null) {
            throw  new CustomRectangleException();
        }
        customRectangleObserverList.add(customRectangleObserver);
    }

    @Override
    public void detach(CustomRectangleObserver customRectangleObserver) throws CustomRectangleException {
        if(customRectangleObserver == null) {
            throw  new CustomRectangleException();
        }
        customRectangleObserverList.remove(customRectangleObserver);
    }

    @Override
    public void notifyObservers(){
        CustomRectangleEvent event = new CustomRectangleEvent(this);
        for (CustomRectangleObserver customRectangleObserver : customRectangleObserverList) {
            try {
                customRectangleObserver.parameterChanged(event);
            } catch (CustomRectangleException e) {
                //log
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomRectangle rectangle = (CustomRectangle) o;
        boolean resultLength = rectangle.getRectangleLength() == this.getRectangleLength();
        boolean resultWidth = rectangle.getRectangleWidth() == this.getRectangleWidth();
        return (resultLength && resultWidth);
    }

    @Override
    public int hashCode() {
        int hash = 31 * (int)rectangleId;
        return hash;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\nCustomRectangle{");
        sb.append("\nrectangleId = ").append(rectangleId);
        sb.append("\nwidth = ").append(this.getRectangleWidth());
        sb.append("\nlength = ").append(this.getRectangleLength());
        sb.append("\n");
        return sb.toString();
    }
}
