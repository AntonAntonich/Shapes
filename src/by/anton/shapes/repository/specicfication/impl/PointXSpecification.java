package by.anton.shapes.repository.specicfication.impl;

import by.anton.shapes.entity.CustomRectangle;
import by.anton.shapes.repository.specicfication.Specification;

public class PointXSpecification implements Specification {
    private int from;
    private int to;

    public PointXSpecification(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(CustomRectangle customRectangle) {
        double coordinateX = customRectangle.getCustomPointA().getCoordinateX();
        boolean result = ((from >= coordinateX) && (coordinateX <= to));
        return result;
    }
}
