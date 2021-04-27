package by.anton.shapes.parser;

import by.anton.shapes.exception.CustomRectangleException;
import by.anton.shapes.exception.EmptyStringException;

import static by.anton.shapes.validator.StringDoubleValidator.*;
import static by.anton.shapes.validator.EmptyStringValidator.*;
import static by.anton.shapes.validator.ContainsNullValidator.*;


import java.util.ArrayList;
import java.util.List;

public class DataRectangleParser {
    private static final String SEPARATOR = ",";
    private static  final int ARRAY_CAPACITY = 8;
    public static List<Double[]> parsStringToDoubleArrays(List<String> strings)
            throws EmptyStringException, CustomRectangleException {
        if(isEmptyString(strings.toString())){
            throw new EmptyStringException();
        }

        Double[] array;
        List<Double[]> arrays = new ArrayList<>();
        for (String string : strings) {
            if(isStringContainsOnlyDoubleValues(string)) {
                array = new Double[ARRAY_CAPACITY];
                String [] elements = string.split(SEPARATOR);
                for (int i = 0; i < elements.length; i++) {
                    array[i] = Double.parseDouble(elements[i]);
                }
                if(isContainNull(array)) {
                    throw new CustomRectangleException();
                }
                arrays.add(array);
            }
        }
        return arrays;
    }
}
