package by.anton.shapes.repository.specicfication;

import by.anton.shapes.entity.CustomRectangle;

@FunctionalInterface
public interface Specification {
    boolean specify(CustomRectangle customRectangle);
}
