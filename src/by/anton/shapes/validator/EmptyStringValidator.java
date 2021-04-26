package by.anton.shapes.validator;

public class EmptyStringValidator {
    public static boolean isEmptyString(String string){
        boolean result = (string == null) || (string.length() == 0);
        return result;
    }
}
