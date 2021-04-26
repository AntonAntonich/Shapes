package by.anton.shapes.repository.specicfication.impl;

import by.anton.shapes.entity.CustomRectangle;
import by.anton.shapes.repository.specicfication.Specification;

public class IdSpecification implements Specification {

    private int from;
    private int to;

    public IdSpecification(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(CustomRectangle customRectangle) {

        boolean result =
                ((from >= customRectangle.getRectangleId()) && (customRectangle.getRectangleId() <= to));
        return result;
    }
}
