package by.anton.shapes.validator;

public class ContainsNullValidator {
    public static boolean isContainNull(Double[] array) {
        for (Double element : array) {
            if(element == null) {
                return true;
            }
        }
        return false;
    }
}
