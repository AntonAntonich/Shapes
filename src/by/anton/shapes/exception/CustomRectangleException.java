package by.anton.shapes.exception;

public class CustomRectangleException extends Exception{
    public CustomRectangleException() {
    }

    public CustomRectangleException(String message) {
        super(message);
    }

    public CustomRectangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomRectangleException(Throwable cause) {
        super(cause);
    }
}
