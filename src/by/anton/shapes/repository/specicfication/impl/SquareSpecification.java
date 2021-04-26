package by.anton.shapes.repository.specicfication.impl;

import by.anton.shapes.entity.CustomRectangle;
import by.anton.shapes.repository.specicfication.Specification;
import by.anton.shapes.warehouse.CustomRectangleWarehouse;

public class SquareSpecification implements Specification {
    private int from;
    private int to;

    public SquareSpecification(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(CustomRectangle customRectangle) {
        CustomRectangleWarehouse container = CustomRectangleWarehouse.getInstance();
        long id = customRectangle.getRectangleId();
        double square = container.getRectangleParameterById(id).getSquare();
        boolean result =
                ((from >= square) && (square <= to));
        return result;
    }
}
