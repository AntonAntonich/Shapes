package by.anton.shapes.observer;

import by.anton.shapes.entity.CustomRectangle;

import java.util.EventObject;

public class CustomRectangleEvent extends EventObject {
    public CustomRectangleEvent(CustomRectangle source) {
        super(source);
    }

    @Override
    public CustomRectangle getSource() {
        return (CustomRectangle) super.getSource();
    }
}
