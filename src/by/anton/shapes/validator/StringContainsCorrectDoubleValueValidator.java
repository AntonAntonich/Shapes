package by.anton.shapes.validator;

import java.util.List;

public class StringContainsCorrectDoubleValueValidator {
    private static final String SEPARATOR = ",";
    public static boolean isStringContainsOnlyDoubleValues(String checkingString){
        boolean result = true;
        String [] elements = checkingString.split(SEPARATOR);
        try{
            for(String element : elements){
                Double.parseDouble(element);
            }
        }catch (IllegalArgumentException e){
            result = false;
        }
        return result;
    }
}
